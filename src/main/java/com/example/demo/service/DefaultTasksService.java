package com.example.demo.service;

import com.example.demo.dto.TasksDTO;
import com.example.demo.repository.TasksRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DefaultTasksService implements TasksService{

    private final TasksRepository tasksRepository;

    @Override
    public TasksDTO saveTasks(TasksDTO tasksDTO) {
        return null;
    }

    @Override
    public void deleteTasks(int ID) {

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
