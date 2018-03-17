package com.iglulabs.form;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) 
public class PersonForm {
	
	private Long id;
    private String person_Name;
    private String mob;
    private String password;
   	private String email;
   	private String role;
   	private String userId;
   	
   	private String nameArr[];
   	private String mobileNoArr[];
   	private String emailIdArr[];
   	private String userIdArr[];
   	private String passwordArr[];
   	

   	
   	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String[] getNameArr() {
		return nameArr;
	}
	public void setNameArr(String[] nameArr) {
		this.nameArr = nameArr;
	}
	public String[] getMobileNoArr() {
		return mobileNoArr;
	}
	public void setMobileNoArr(String[] mobileNoArr) {
		this.mobileNoArr = mobileNoArr;
	}
	public String[] getEmailIdArr() {
		return emailIdArr;
	}
	public void setEmailIdArr(String[] emailIdArr) {
		this.emailIdArr = emailIdArr;
	}
	public String[] getUserIdArr() {
		return userIdArr;
	}
	public void setUserIdArr(String[] userIdArr) {
		this.userIdArr = userIdArr;
	}
	public String[] getPasswordArr() {
		return passwordArr;
	}
	public void setPasswordArr(String[] passwordArr) {
		this.passwordArr = passwordArr;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPerson_Name() {
		return person_Name;
	}
	public String getEmail() {
		return email;
	}
	
	public void setPerson_Name(String person_Name) {
		this.person_Name = person_Name;
	}
	
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
