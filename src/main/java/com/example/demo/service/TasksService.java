package com.example.demo.service;

import com.example.demo.dto.TasksDTO;

import java.util.List;

public interface TasksService {
    TasksDTO saveTasks(TasksDTO tasksDTO);
    void deleteTasks(int ID);
    TasksDTO findByName(String name);
    List<TasksDTO> findAll();
}

