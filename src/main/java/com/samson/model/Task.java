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
@Table(name="GPS_TASK")
public class Task {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="tracker_id")
	String tracker_id; 
	@Column(name="truck_id")
	String truck_id; 
	@Column(name="user_id")
	String user_id; 
	@Column(name="description")
	String description; 			
 

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTracker_id() {
		return tracker_id;
	}
	public void setTracker_id(String tracker_id) {
		this.tracker_id = tracker_id;
	}
	public String getTruck_id() {
		return truck_id;
	}
	public void setTruck_id(String truck_id) {
		this.truck_id = truck_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString(){
		return "id="+id+", tracker_id="+tracker_id+", truck_id="+truck_id+", userId="+user_id;
	}

}
