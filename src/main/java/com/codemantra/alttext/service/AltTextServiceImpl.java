package com.codemantra.alttext.service;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.codemantra.alttext.api.model.AltText;
import com.codemantra.alttext.api.model.AmazonS3;
import com.codemantra.alttext.api.model.Constants;
import com.codemantra.alttext.dao.BoxBaseDao;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.core.ZipFile;

@Component
public class AltTextServiceImpl implements AltTextService {
	@Autowired
	private BoxBaseDao baseDao;
	@Value("${ALT_TEXT_FILE_SAVE_PATH}")
	private String ALT_TEXT_FILE_SAVE_PATH;

	@Value("${math_api}")
	private String math_api;

	private String img_path = "";

	private final Logger logger = LoggerFactory.getLogger(AltTextServiceImpl.class);

	public AltTextServiceImpl() {
		super();
	}

	@Override
	public void processAltTextRegenerate(AltText altTextItem) {
		try {
			com.codemantra.alttext.api.model.AmazonS3 s3Credentials = baseDao.getAmazonS3MetaData();
			downloadFileFromS3(s3Credentials, altTextItem);

			long file_id = baseDao.getfileid(altTextItem);

			// regen API
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.set("Content-Type", "application/json");
			httpHeaders.set("charset", "UTF-8");

			JSONObject json = new JSONObject();
			json.put("fileName", img_path + File.separator + altTextItem.getImage_name());
			json.put("description", true);
			json.put("taskId", altTextItem.getTask_id());
			json.put("fileId", file_id);
			HttpEntity<String> httpEntity = new HttpEntity<String>(json.toString(), httpHeaders);
			RestTemplate restTemplate = new RestTemplate();
			String response = restTemplate.postForObject(math_api, httpEntity, String.class);
			JSONObject jsonObj = new JSONObject(response);
			if (jsonObj.get("status").equals("Success")) {
				JSONObject data = (JSONObject) jsonObj.get("data");
				JSONObject img = (JSONObject) data.get(altTextItem.getImage_name());
				if (img != null) {
					if (!img.get("data").equals("null")) {
						JSONObject img_data = (JSONObject) img.get("data");
						String long_des = img_data.get("description").toString();
						baseDao.updatedescription(long_des, altTextItem.getUnique_identifier());
						baseDao.updateAltTextStatus(Constants.COMPLETED, altTextItem.getUnique_identifier());
						System.out.println("Completed: " + altTextItem.getUnique_identifier());
					} else {
						System.out.println("Unable to get data from math API");
					}
				} else
					System.out.println("Unable to get data from math API");
			}
			// TODO: UPDATE TO STATUS COMPLETED (4) after done with the process.
			//delete the dir after complete
		} catch (Exception e) {
			baseDao.updateAltTextStatus(Constants.EXCEPTION, altTextItem.getUnique_identifier());
			logger.error("Error at processAltTextRegenerate : " + e.getMessage());
			e.printStackTrace();
		}
	}

	private com.amazonaws.services.s3.AmazonS3 getAmazonS3Client(com.codemantra.alttext.api.model.AmazonS3 apiEntity) {
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(apiEntity.getS3_client_id(),
				apiEntity.getS3_client_secret());
		com.amazonaws.services.s3.AmazonS3 s3client = new AmazonS3Client(awsCreds);
		s3client.setRegion(Region.getRegion(Regions.fromName(apiEntity.getS3_region())));

		s3client.setS3ClientOptions(S3ClientOptions.builder().setAccelerateModeEnabled(true).build());
		return s3client;
	}

	public void downloadFileFromS3(AmazonS3 s3Credentials, AltText altTextItem) {
		try {
			com.amazonaws.services.s3.AmazonS3 s3client = getAmazonS3Client(s3Credentials);
			String s3URL = baseDao.getS3URL(altTextItem);
			String fileName = FilenameUtils.getName(s3URL);
			S3Object s3object = s3client.getObject(s3Credentials.getS3_bucket(), s3URL);
			S3ObjectInputStream inputStream = s3object.getObjectContent();
			FileUtils.copyInputStreamToFile(inputStream,
					new File(ALT_TEXT_FILE_SAVE_PATH + altTextItem.getTask_id() + "/" + fileName));
			String source = ALT_TEXT_FILE_SAVE_PATH + altTextItem.getTask_id() + File.separator + fileName;
			String destination = ALT_TEXT_FILE_SAVE_PATH + altTextItem.getTask_id();
			if (!new File(destination + File.separator + fileName.replaceAll("_logs.zip", "")).exists()) {
				try {
					ZipFile zipFile = new ZipFile(source);
					zipFile.extractAll(destination);
				} catch (ZipException e) {
					e.printStackTrace();
				}
				img_path = destination + File.separator + fileName.replaceAll("_logs.zip", "") + File.separator
						+ "Image";
			} else {
				img_path = destination + File.separator + fileName.replaceAll("_logs.zip", "") + File.separator
						+ "Image";
			}
		} catch (IOException e) {
			baseDao.updateAltTextStatus(Constants.EXCEPTION, altTextItem.getUnique_identifier());
			logger.error("Error at processAltTextRegenerate : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
