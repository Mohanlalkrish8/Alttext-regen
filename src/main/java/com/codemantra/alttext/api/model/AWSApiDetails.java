package com.codemantra.alttext.api.model;

import java.io.Serializable;

public class AWSApiDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
		private String bucket_name;
		private String bucket_folder;
		private String region_code;
		private String access_key_id;
		private String access_secret_key;
		private String mail_s3_client_id;
		private String mail_s3_client_secret;
		private int project_id;
		
		private String sender_username ;
		private String serder_password;
		private String sender_host; 
		private String sender_from;
		private String sender_port;
		private String company_email;
		private int company_id;
			
		
		public int getCompany_id() {
			return company_id;
		}
		public void setCompany_id(int company_id) {
			this.company_id = company_id;
		}
		public String getCompany_email() {
			return company_email;
		}
		public void setCompany_email(String company_email) {
			this.company_email = company_email;
		}
		public String getSender_username() {
			return sender_username;
		}
		public void setSender_username(String sender_username) {
			this.sender_username = sender_username;
		}
		public String getSerder_password() {
			return serder_password;
		}
		public void setSerder_password(String serder_password) {
			this.serder_password = serder_password;
		}
		public String getSender_host() {
			return sender_host;
		}
		public void setSender_host(String sender_host) {
			this.sender_host = sender_host;
		}
		public String getSender_from() {
			return sender_from;
		}
		public void setSender_from(String sender_from) {
			this.sender_from = sender_from;
		}
		public String getSender_port() {
			return sender_port;
		}
		public void setSender_port(String sender_port) {
			this.sender_port = sender_port;
		}
		public int getProject_id() {
			return project_id;
		}
		public void setProject_id(int project_id) {
			this.project_id = project_id;
		}
		public String getBucket_name() {
			return bucket_name;
		}
		public void setBucket_name(String bucket_name) {
			this.bucket_name = bucket_name;
		}
		public String getBucket_folder() {
			return bucket_folder;
		}
		public void setBucket_folder(String bucket_folder) {
			this.bucket_folder = bucket_folder;
		}
		public String getRegion_code() {
			return region_code;
		}
		public void setRegion_code(String region_code) {
			this.region_code = region_code;
		}
		public String getAccess_key_id() {
			return access_key_id;
		}
		public void setAccess_key_id(String access_key_id) {
			this.access_key_id = access_key_id;
		}
		public String getAccess_secret_key() {
			return access_secret_key;
		}
		public void setAccess_secret_key(String access_secret_key) {
			this.access_secret_key = access_secret_key;
		}
		public String getMail_s3_client_id() {
			return mail_s3_client_id;
		}
		public void setMail_s3_client_id(String mail_s3_client_id) {
			this.mail_s3_client_id = mail_s3_client_id;
		}
		public String getMail_s3_client_secret() {
			return mail_s3_client_secret;
		}
		public void setMail_s3_client_secret(String mail_s3_client_secret) {
			this.mail_s3_client_secret = mail_s3_client_secret;
		}
}
