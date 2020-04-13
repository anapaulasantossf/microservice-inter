package com.inter.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.inter.data.TaskData;
import com.inter.entities.Task;
import com.inter.response.CustomResponseWrapper;
import com.inter.service.TaskService;

/**
*
* @author Ana
*/
@RestController
@RequestMapping("/api")
public class TaskController {
	
	@Autowired
	TaskService taskService;	
	
	@GetMapping("/tasks")
	public ResponseEntity<List<Task>> getAllByTasks() {		
		List<Task> tasks = taskService.getTaskInformations();					
		return ResponseEntity.status(HttpStatus.OK).body(tasks);		
	}	
	
	@PostMapping("/tasks")
	public ResponseEntity<CustomResponseWrapper<Task>> insertTask(@Valid @RequestBody TaskData taskData, BindingResult result) {
		
		CustomResponseWrapper<Task> response = new CustomResponseWrapper<Task>();

		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}		
		
		Task taskInsert = this.taskService.insertTask(taskData);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand(taskData.getId()).toUri();

		response.setData(taskInsert);
		return ResponseEntity.created(location).body(response);
	}	
}
