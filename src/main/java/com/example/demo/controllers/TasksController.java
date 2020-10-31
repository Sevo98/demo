package com.example.demo.controllers;

import com.example.demo.dto.TasksDTO;
import com.example.demo.service.TasksServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TasksController {

    private TasksServiceImpl tasksServiceImpl;

    @PostMapping("/save")
    public TasksDTO saveTasks(@RequestBody TasksDTO tasksDTO){
        return tasksServiceImpl.saveTasks(tasksDTO);
    }

    @GetMapping("/findAll")
    public List<TasksDTO> findAllTasks()
    {
        return tasksServiceImpl.findAll();
    }

}