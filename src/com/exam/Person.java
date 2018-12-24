package com.exam;

public class Person {
	private String name,id,password,gender,job;
	private String[] notice;
	public String getName() {
		return name == null ? "" : name.trim();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id == null ? "" : id.trim();
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password == null ? "" : password.trim();
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender == null ? "" : gender.trim();
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job == null ? "" : job.trim();
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getNotice() {
		return notice;
	}
	public void setNotice(String[] notice) {
		this.notice = notice;
	}
}
