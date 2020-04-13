package com.inter.data;

import java.sql.Date;

public class TaskData {
	
	private Integer	id;
	private String 	name;
	private Number 	weight;
	private boolean completed;
	private Date 	createdAt;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getWeight() {
		return weight;
	}
	public void setWeight(Number weight) {
		this.weight = weight;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}	
	
}
