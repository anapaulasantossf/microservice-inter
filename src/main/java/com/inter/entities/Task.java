package com.inter.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "task")
public class Task implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer	id;
	
	@Column(name = "name")
	private String 	name;
	
	@Column(name = "weight")
	private Number 	weight;
	
	@Column(name = "completed")
	private boolean completed;
	
	@Column(name = "createdArt")
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
