package com.inter.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "jobs")
public class Jobs implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	@Column(name = "name")
	private String 	name;
	
	@Column(name = "active")
	private boolean active;

	public Jobs() {

	}	

	public Jobs(int id, String name, boolean active) {
		this.id = id;
		this.name = name;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Jobs [id=" + id + ", name=" + name + ", active=" + active + "]";
	}
}
