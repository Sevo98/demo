package com.example.demo.controllers;

import com.example.demo.domain.*;
import com.example.demo.dto.TasksDTO;
import com.example.demo.repository.TasksRepository;
import com.example.demo.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    private TasksService tasksService;

    @PostMapping("/save")
    public TasksDTO saveTasks(@RequestBody TasksDTO tasksDTO){
        return tasksService.saveTasks(tasksDTO);
    }

    @GetMapping("/findAll")
    public List<TasksDTO> findAllTasks()
    {
        return tasksService.findAll();
    }


}