package com.iglulabs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "login")
public class Login implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id", length = 11)
	private Long id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_password")
	private String userPassword;

	@Column(name = "role")
	private String role;

	//@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@OneToOne
	 @Cascade({CascadeType.DELETE})
	@JoinColumn(name = "user_id",nullable=false)
	private Person person;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}