package com.codemantra.alttext.api.model;

import java.util.Date;

public class AltText {
	private long project_details_id;
	private long project_id;
	private long task_id;
	private long page_no;
	private String file_name;
	private String page_name;
	private long image_no;
	private String image_name;
	private boolean is_decorative;
	private String alt_text_short;
	private String alt_text_long;
	private long complexity_level;
	private long est_time_mins;
	private long confidence_level;
	private long created_by;
	private long modified_by;
	private Date created_date;
	private Date modified_date;
	private String unique_identifier;
	private float x_min;
	private float x_max;
	private float y_min;
	private float y_max;
	private long approved_by;
	private long approve_status;
	private long master_task_id;
	private float imageWidth;
	private float imageHeight;
	private String type;
	private String thumbnail_s3path;
	private boolean is_deleted;
	private boolean is_active;

	public AltText() {
		super();
	}

	public AltText(long project_details_id, long project_id, long task_id, long page_no, String page_name,
			long image_no, String image_name, boolean is_decorative, String alt_text_short, String alt_text_long,
			long complexity_level, long est_time_mins, long confidence_level, long created_by, long modified_by,
			Date created_date, Date modified_date, String unique_identifier, float x_min, float x_max, float y_min,
			float y_max, long approved_by, long approve_status, long master_task_id, String type, Float imageWidth,
			Float imageHeight, String thumbnail_s3path, String file_name) {
		super();
		this.project_details_id = project_details_id;
		this.project_id = project_id;
		this.task_id = task_id;
		this.page_no = page_no;
		this.page_name = page_name;
		this.image_no = image_no;
		this.image_name = image_name;
		this.is_decorative = is_decorative;
		this.alt_text_short = alt_text_short;
		this.alt_text_long = alt_text_long;
		this.complexity_level = complexity_level;
		this.est_time_mins = est_time_mins;
		this.confidence_level = confidence_level;
		this.created_by = created_by;
		this.modified_by = modified_by;
		this.created_date = created_date;
		this.modified_date = modified_date;
		this.unique_identifier = unique_identifier;
		this.x_min = x_min;
		this.x_max = x_max;
		this.y_min = y_min;
		this.y_max = y_max;
		this.approved_by = approved_by;
		this.approve_status = approve_status;
		this.master_task_id = master_task_id;
		this.type = type;
		this.thumbnail_s3path = thumbnail_s3path;
		this.imageWidth = imageWidth;
		this.imageHeight = imageHeight;
		this.file_name = file_name;
	}
	
	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public long getMaster_task_id() {
		return master_task_id;
	}

	public void setMaster_task_id(long master_task_id) {
		this.master_task_id = master_task_id;
	}

	public long getProject_id() {
		return project_id;
	}

	public void setProject_id(long project_id) {
		this.project_id = project_id;
	}

	public long getTask_id() {
		return task_id;
	}

	public void setTask_id(long task_id) {
		this.task_id = task_id;
	}

	public long getPage_no() {
		return page_no;
	}

	public void setPage_no(long page_no) {
		this.page_no = page_no;
	}

	public String getPage_name() {
		return page_name;
	}

	public void setPage_name(String page_name) {
		this.page_name = page_name;
	}

	public long getImage_no() {
		return image_no;
	}

	public void setImage_no(long image_no) {
		this.image_no = image_no;
	}

	public String getImage_name() {
		return image_name;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}

	public boolean isIs_decorative() {
		return is_decorative;
	}

	public void setIs_decorative(boolean is_decorative) {
		this.is_decorative = is_decorative;
	}

	public String getAlt_text_short() {
		return alt_text_short;
	}

	public void setAlt_text_short(String alt_text_short) {
		this.alt_text_short = alt_text_short;
	}

	public String getAlt_text_long() {
		return alt_text_long;
	}

	public void setAlt_text_long(String alt_text_long) {
		this.alt_text_long = alt_text_long;
	}

	public long getComplexity_level() {
		return complexity_level;
	}

	public void setComplexity_level(long complexity_level) {
		this.complexity_level = complexity_level;
	}

	public long getEst_time_mins() {
		return est_time_mins;
	}

	public void setEst_time_mins(long est_time_mins) {
		this.est_time_mins = est_time_mins;
	}

	public long getConfidence_level() {
		return confidence_level;
	}

	public void setConfidence_level(long confidence_level) {
		this.confidence_level = confidence_level;
	}

	public long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(long created_by) {
		this.created_by = created_by;
	}

	public long getModified_by() {
		return modified_by;
	}

	public void setModified_by(long modified_by) {
		this.modified_by = modified_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	public String getUnique_identifier() {
		return unique_identifier;
	}

	public void setUnique_identifier(String unique_identifier) {
		this.unique_identifier = unique_identifier;
	}

	public float getX_min() {
		return x_min;
	}

	public void setX_min(float x_min) {
		this.x_min = x_min;
	}

	public float getX_max() {
		return x_max;
	}

	public void setX_max(float x_max) {
		this.x_max = x_max;
	}

	public float getY_min() {
		return y_min;
	}

	public void setY_min(float y_min) {
		this.y_min = y_min;
	}

	public float getY_max() {
		return y_max;
	}

	public void setY_max(float y_max) {
		this.y_max = y_max;
	}

	public long getApproved_by() {
		return approved_by;
	}

	public void setApproved_by(long approved_by) {
		this.approved_by = approved_by;
	}

	public long getApprove_status() {
		return approve_status;
	}

	public void setApprove_status(long approve_status) {
		this.approve_status = approve_status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getProject_details_id() {
		return project_details_id;
	}

	public void setProject_details_id(long project_details_id) {
		this.project_details_id = project_details_id;
	}

	public String getThumbnail_s3path() {
		return thumbnail_s3path;
	}

	public void setThumbnail_s3path(String thumbnail_s3path) {
		this.thumbnail_s3path = thumbnail_s3path;
	}

	public float getImageWidth() {
		return imageWidth;
	}

	public void setImageWidth(float imageWidth) {
		this.imageWidth = imageWidth;
	}

	public float getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(float imageHeight) {
		this.imageHeight = imageHeight;
	}

	public boolean isIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public void setDetections(DetectedObject dobj) {
		Coordinate cod = dobj.getCoordinate();
		this.x_min = cod.getXmin();
		this.x_max = cod.getXmax();
		this.y_min = cod.getYmin();
		this.y_max = cod.getYmax();
		this.unique_identifier = dobj.getId();

	}

	@Override
	public String toString() {
		return "AltText [project_id=" + project_id + ", project_details_id " + this.project_details_id + " task_id="
				+ task_id + ", page_no=" + page_no + ", page_name=" + page_name + ", image_no=" + image_no
				+ ", image_name=" + image_name + ", is_decorative=" + is_decorative + ", alt_text_short="
				+ alt_text_short + ", alt_text_long=" + alt_text_long + ", complexity_level=" + complexity_level
				+ ", est_time_mins=" + est_time_mins + ", confidence_level=" + confidence_level + ", created_by="
				+ created_by + ", modified_by=" + modified_by + ", created_date=" + created_date + ", modified_date="
				+ modified_date + ", unique_identifier=" + unique_identifier + ", x_min=" + x_min + ", x_max=" + x_max
				+ ", y_min=" + y_min + ", y_max=" + y_max + ", approved_by=" + approved_by + ", approve_status="
				+ approve_status + "]";
	}

}
