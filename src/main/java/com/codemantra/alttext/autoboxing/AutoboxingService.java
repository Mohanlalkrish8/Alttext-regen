package com.codemantra.alttext.autoboxing;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.codemantra.alttext.api.model.AltText;
import com.codemantra.alttext.api.model.Constants;
import com.codemantra.alttext.dao.BoxBaseDao;
import com.codemantra.alttext.service.AltTextService;

@PropertySource({ "classpath:application.properties" })
@EnableScheduling
@Component
public class AutoboxingService {
	private final Logger logger = LoggerFactory.getLogger(AutoboxingService.class);

	@Autowired
	private AltTextService service;

	@Autowired
	private BoxBaseDao boxDao;

	@Autowired
	private TaskExecutor taskExecutor;

	@Value("${ALT_TEXT_REGENERATE_STATUS}")
	public Integer ALT_TEXT_REGENERATE_STATUS;

	@SuppressWarnings("deprecation")
	@Scheduled(fixedDelay = 5000)
	public void getAndUpdateTaskToESThread() {
		List<AltText> altTextItemsList = boxDao.altTextItems(ALT_TEXT_REGENERATE_STATUS);
		for (AltText altText : altTextItemsList) {
			try {
				logger.info("Started processing : " + altText.getUnique_identifier());
				boxDao.updateAltTextStatus(Constants.IN_PROGRESS, altText.getUnique_identifier());
				AutoboxingThread autoTaggingThread = new AutoboxingThread(altText);
				autoTaggingThread.setaltTextService(this.service);
				taskExecutor.execute(autoTaggingThread);
			} catch (Exception e) {
				boxDao.updateAltTextStatus(Constants.EXCEPTION, altText.getUnique_identifier());
				logger.error("Thread error: " + e.getMessage());
				e.printStackTrace();
			}
		}

	}
}
