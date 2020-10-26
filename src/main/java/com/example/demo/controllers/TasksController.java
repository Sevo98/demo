package com.example.demo.controllers;

import com.example.demo.domain.*;
import com.example.demo.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Java-doc
 */
@RestController
public class TasksController {

    private TasksRepository tasksRepository;

    @Autowired
    public TasksController(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    @GetMapping("/getTasksList")
    public List<Tasks> allTasks() {
        return tasksRepository.findAll();
    }

    // TODO: тут методов не хватает, но думаю вы это знаете
}
