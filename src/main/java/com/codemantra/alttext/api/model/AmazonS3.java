package com.codemantra.alttext.api.model;

import java.io.Serializable;

public class AmazonS3 implements Serializable {

	private static final long serialVersionUID = 1L;

	private String s3_client_id;
	private String s3_client_secret;
	private String s3_bucket;
	private String s3_region;

	public String getS3_client_id() {
		return s3_client_id;
	}

	public void setS3_client_id(String s3_client_id) {
		this.s3_client_id = s3_client_id;
	}

	public String getS3_client_secret() {
		return s3_client_secret;
	}

	public void setS3_client_secret(String s3_client_secret) {
		this.s3_client_secret = s3_client_secret;
	}

	public String getS3_bucket() {
		return s3_bucket;
	}

	public void setS3_bucket(String s3_bucket) {
		this.s3_bucket = s3_bucket;
	}

	public String getS3_region() {
		return s3_region;
	}

	public void setS3_region(String s3_region) {
		this.s3_region = s3_region;
	}

}
