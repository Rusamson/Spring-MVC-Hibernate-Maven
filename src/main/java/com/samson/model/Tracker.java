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
@Table(name="GPS_TRACKER")
public class Tracker {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="gsm")
	String gsm; 
	@Column(name="imei")
	String imei; 
	@Column(name="name")
	String name; 
	@Column(name="description")
	String description; 			
 

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	 
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString(){
		return "id="+id+", plate="+gsm+", model="+imei+", color="+name+", description="+description;
	}

}
