package com.inter.repositoryentities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inter.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
