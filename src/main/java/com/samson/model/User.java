package com.samson.model;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Samson
 *
 */
@Entity
@Table(name="GPS_USER")
public class User {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="firstname")
	String firstname; 
	@Column(name="lastname")
	String lastname; 
	@Column(name="phone")
	String phone; 
	@Column(name="email")
	String email; 			
 	@Column(name="password")
	String password; 	
	@Column(name="userId")
	String userId; 	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString(){
		return "id="+id+", firstname="+firstname+", lastname="+lastname+", phone="+phone+", email="+email+", password="+password+", userId="+userId;
	}

}
