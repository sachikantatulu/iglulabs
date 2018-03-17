package com.iglulabs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "person")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	@Column(name = "person_Name")
    private String person_Name;
	@Column(name = "mob", unique=true)
    private String mob;
	@Column(name = "password")
	private String password;
	/*@Column(name = "role")
	private String role;*/
	@Column(name = "email")
   	private String email;
	/*@Column(name = "imag")
    private String imag;*/
	@Column(name = "user_id",unique=true)
    private String userId;
	/*@Column(name = "examCode")
    private String examCode;
	*/
	
	
	public String getMob() {
		return mob;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	/*public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPerson_Name() {
		return person_Name;
	}
	public void setPerson_Name(String person_Name) {
		this.person_Name = person_Name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*public String getImag() {
		return imag;
	}
	public void setImag(String imag) {
		this.imag = imag;
	}*/
	
	/*public String getExamCode() {
		return examCode;
	}
	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
