package com.example.demo.service;

import com.example.demo.controllers.TasksController;
import com.example.demo.converters.TasksConverter;
import com.example.demo.domain.Tasks;
import com.example.demo.dto.TasksDTO;
import com.example.demo.repository.TasksRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@AllArgsConstructor
@Service
public class TasksServiceImpl implements TasksService {

    private final TasksRepository tasksRepository;

    private final TasksConverter tasksConverter;

    @Override
    public TasksDTO saveTasks(TasksDTO tasksDTO) {
        Tasks saveTasks = tasksRepository.save(tasksConverter.fromTasksDtoTasks(tasksDTO));
        return tasksConverter.fromTasksToTasksDto(saveTasks);
    }

    @Override
    public void deleteTasks(UUID ID) {
        tasksRepository.deleteById(ID);
    }

    @Override
    public TasksDTO findByName(String name) {
        return null;
    }

    @Override
    public List<TasksDTO> findAll() {
        return null;
    }
}
