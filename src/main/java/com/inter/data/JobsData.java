package com.inter.data;

import java.util.ArrayList;

public class JobsData {
	
	private Integer id;
	private String 	name;
	private boolean active;
	
	private ArrayList<TaskData> task;

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public ArrayList<TaskData> getTask() {
		return task;
	}

	public void setTask(ArrayList<TaskData> task) {
		this.task = task;
	}
}
