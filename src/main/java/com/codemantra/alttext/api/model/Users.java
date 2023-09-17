package com.codemantra.alttext.api.model;

import java.io.Serializable;

import java.util.Date;

public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	private long user_id;

	private String user_name;

	private String type;

	private String login_name;

	private String password;

	private String role_id;

	private String project_role_id;

	private String email_id;

	private String phone;

	private String address_1;

	private String address_2;

	private String job_title;

	private String country_name;

	private boolean is_active;

	private boolean is_deleted;

	private String profile_pic_name;

	private long company_id;

	private boolean cache_required;

	private String hashpassword;

	private String saltkey;

	private String invitation_expiry_on;

	private String invitation_url;

	private long logcount;

	private long department_id;

	private int modification_counter;

	private long created_by;

	private Date created_date;

	private long modified_by;

	private Date modified_date;

	private String contact_person;

	private String contact_person_email;

	private String company_name;

	private String role_name;

	private long vendor_id;

	private String vendor_name;

	private boolean manage_rights;

	private boolean is_substitute;

	private int substitute_user_id;

	private String substitute_user_name;

	private String from_date;

	private String to_date;

	private boolean user_is_active;

	private int limit;

	private int offset;

	private int total_count;

	public Users() {

	}

	public Users(long user_id, String user_name, String type, String login_name, String password, String role_id,

			String project_role_id, String email_id, String phone, String address_1, String address_2, String job_title,

			String country_name, boolean is_active, boolean is_deleted, String profile_pic_name, long company_id,

			boolean cache_required, String hashpassword, String saltkey, String invitation_expiry_on,

			String invitation_url, long logcount, long department_id, int modification_counter, long created_by,

			Date created_date, long modified_by, Date modified_date, String contact_person, String contact_person_email,

			String company_name, String role_name, long vendor_id, String vendor_name, boolean manage_rights,

			boolean is_substitute, int substitute_user_id, String substitute_user_name, String from_date,

			String to_date, boolean user_is_active, int limit, int offset, int total_count) {

		super();

		this.user_id = user_id;

		this.user_name = user_name;

		this.type = type;

		this.login_name = login_name;

		this.password = password;

		this.role_id = role_id;

		this.project_role_id = project_role_id;

		this.email_id = email_id;

		this.phone = phone;

		this.address_1 = address_1;

		this.address_2 = address_2;

		this.job_title = job_title;

		this.country_name = country_name;

		this.is_active = is_active;

		this.is_deleted = is_deleted;

		this.profile_pic_name = profile_pic_name;

		this.company_id = company_id;

		this.cache_required = cache_required;

		this.hashpassword = hashpassword;

		this.saltkey = saltkey;

		this.invitation_expiry_on = invitation_expiry_on;

		this.invitation_url = invitation_url;

		this.logcount = logcount;

		this.department_id = department_id;

		this.modification_counter = modification_counter;

		this.created_by = created_by;

		this.created_date = created_date;

		this.modified_by = modified_by;

		this.modified_date = modified_date;

		this.contact_person = contact_person;

		this.contact_person_email = contact_person_email;

		this.company_name = company_name;

		this.role_name = role_name;

		this.vendor_id = vendor_id;

		this.vendor_name = vendor_name;

		this.manage_rights = manage_rights;

		this.is_substitute = is_substitute;

		this.substitute_user_id = substitute_user_id;

		this.substitute_user_name = substitute_user_name;

		this.from_date = from_date;

		this.to_date = to_date;

		this.user_is_active = user_is_active;

		this.limit = limit;

		this.offset = offset;

		this.total_count = total_count;

	}

	public boolean isUser_is_active() {

		return user_is_active;

	}

	public void setUser_is_active(boolean user_is_active) {

		this.user_is_active = user_is_active;

	}

	public String getFrom_date() {

		return from_date;

	}

	public void setFrom_date(String from_date) {

		this.from_date = from_date;

	}

	public String getTo_date() {

		return to_date;

	}

	public void setTo_date(String to_date) {

		this.to_date = to_date;

	}

	public int getSubstitute_user_id() {

		return substitute_user_id;

	}

	public void setSubstitute_user_id(int substitute_user_id) {

		this.substitute_user_id = substitute_user_id;

	}

	public String getSubstitute_user_name() {

		return substitute_user_name;

	}

	public void setSubstitute_user_name(String substitute_user_name) {

		this.substitute_user_name = substitute_user_name;

	}

	public boolean isIs_substitute() {

		return is_substitute;

	}

	public void setIs_substitute(boolean is_substitute) {

		this.is_substitute = is_substitute;

	}

	public long getUser_id() {

		return user_id;

	}

	public void setUser_id(long user_id) {

		this.user_id = user_id;

	}

	public String getUser_name() {

		return user_name;

	}

	public void setUser_name(String user_name) {

		this.user_name = user_name;

	}

	public String getLogin_name() {

		return login_name;

	}

	public void setLogin_name(String login_name) {

		this.login_name = login_name;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	public String getRole_id() {

		return role_id;

	}

	public void setRole_id(String role_id) {

		this.role_id = role_id;

	}

	public String getEmail_id() {

		return email_id;

	}

	public void setEmail_id(String email_id) {

		this.email_id = email_id;

	}

	public String getPhone() {

		return phone;

	}

	public void setPhone(String phone) {

		this.phone = phone;

	}

	public String getAddress_1() {

		return address_1;

	}

	public void setAddress_1(String address_1) {

		this.address_1 = address_1;

	}

	public String getAddress_2() {

		return address_2;

	}

	public void setAddress_2(String address_2) {

		this.address_2 = address_2;

	}

	public String getJob_title() {

		return job_title;

	}

	public void setJob_title(String job_title) {

		this.job_title = job_title;

	}

	public String getCountry_name() {

		return country_name;

	}

	public void setCountry_name(String country_name) {

		this.country_name = country_name;

	}

	public boolean getIs_active() {

		return is_active;

	}

	public void setIs_active(boolean is_active) {

		this.is_active = is_active;

	}

	public boolean isIs_deleted() {

		return is_deleted;

	}

	public void setIs_deleted(boolean is_deleted) {

		this.is_deleted = is_deleted;

	}

	public String getProfile_pic_name() {

		return profile_pic_name;

	}

	public void setProfile_pic_name(String profile_pic_name) {

		this.profile_pic_name = profile_pic_name;

	}

	public long getCompany_id() {

		return company_id;

	}

	public void setCompany_id(long company_id) {

		this.company_id = company_id;

	}

	public boolean isCache_required() {

		return cache_required;

	}

	public void setCache_required(boolean cache_required) {

		this.cache_required = cache_required;

	}

	public String getHashpassword() {

		return hashpassword;

	}

	public void setHashpassword(String hashpassword) {

		this.hashpassword = hashpassword;

	}

	public String getSaltkey() {

		return saltkey;

	}

	public void setSaltkey(String saltkey) {

		this.saltkey = saltkey;

	}

	public String getInvitation_url() {

		return invitation_url;

	}

	public void setInvitation_url(String invitation_url) {

		this.invitation_url = invitation_url;

	}

	public long getLogcount() {

		return logcount;

	}

	public void setLogcount(long logcount) {

		this.logcount = logcount;

	}

	public long getDepartment_id() {

		return department_id;

	}

	public void setDepartment_id(long department_id) {

		this.department_id = department_id;

	}

	public int getModification_counter() {

		return modification_counter;

	}

	public void setModification_counter(int modification_counter) {

		this.modification_counter = modification_counter;

	}

	public long getCreated_by() {

		return created_by;

	}

	public void setCreated_by(long created_by) {

		this.created_by = created_by;

	}

	public Date getCreated_date() {

		return created_date;

	}

	public void setCreated_date(Date created_date) {

		this.created_date = created_date;

	}

	public long getModified_by() {

		return modified_by;

	}

	public void setModified_by(long modified_by) {

		this.modified_by = modified_by;

	}

	public Date getModified_date() {

		return modified_date;

	}

	public void setModified_date(Date modified_date) {

		this.modified_date = modified_date;

	}

	public static long getSerialversionuid() {

		return serialVersionUID;

	}

	public String getInvitation_expiry_on() {

		return invitation_expiry_on;

	}

	public void setInvitation_expiry_on(String invitation_expiry_on) {

		this.invitation_expiry_on = invitation_expiry_on;

	}

	public String getRole_name() {

		return role_name;

	}

	public void setRole_name(String role_name) {

		this.role_name = role_name;

	}

	public String getType() {

		return type;

	}

	public void setType(String type) {

		this.type = type;

	}

	public String getCompany_name() {

		return company_name;

	}

	public void setCompany_name(String company_name) {

		this.company_name = company_name;

	}

	public String getContact_person() {

		return contact_person;

	}

	public void setContact_person(String contact_person) {

		this.contact_person = contact_person;

	}

	public String getContact_person_email() {

		return contact_person_email;

	}

	public void setContact_person_email(String contact_person_email) {

		this.contact_person_email = contact_person_email;

	}

	public long getVendor_id() {

		return vendor_id;

	}

	public void setVendor_id(long vendor_id) {

		this.vendor_id = vendor_id;

	}

	public String getVendor_name() {

		return vendor_name;

	}

	public void setVendor_name(String vendor_name) {

		this.vendor_name = vendor_name;

	}

	public boolean isManage_rights() {

		return manage_rights;

	}

	public void setManage_rights(boolean manage_rights) {

		this.manage_rights = manage_rights;

	}

	public String getProject_role_id() {

		return project_role_id;

	}

	public void setProject_role_id(String project_role_id) {

		this.project_role_id = project_role_id;

	}

	public int getLimit() {

		return limit;

	}

	public void setLimit(int limit) {

		this.limit = limit;

	}

	public int getOffset() {

		return offset;

	}

	public void setOffset(int offset) {

		this.offset = offset;

	}

	public int getTotal_count() {

		return total_count;

	}

	public void setTotal_count(int total_count) {

		this.total_count = total_count;

	}

}