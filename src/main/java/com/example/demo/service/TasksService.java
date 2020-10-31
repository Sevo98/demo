package com.example.demo.service;

import com.example.demo.dto.TasksDTO;

import java.util.*;


public interface TasksService {
    TasksDTO saveTasks(TasksDTO tasksDTO);
    void deleteTasks(UUID ID);
    TasksDTO findByName(String name);
    List<TasksDTO> findAll();
}

