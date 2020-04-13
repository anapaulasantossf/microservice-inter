package com.inter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inter.data.TaskData;
import com.inter.entities.Task;
import com.inter.repositoryentities.TaskRepository;


@Service
public class TaskService {
	
	@Autowired
	TaskRepository taskRepository;
	
	public List<Task> getTaskInformations() {		
		return taskRepository.findAll();
	}
	
	public Task insertTask(TaskData taskData) {
		
		Task task = new Task();
		task.setId(taskData.getId());
		task.setName(taskData.getName());
		task.setWeight(taskData.getWeight());
		task.setCompleted(taskData.isCompleted());
		task.setCreatedAt(taskData.getCreatedAt());	
		
		return taskRepository.save(task);
	}
}
