package com.example.demo.converters;

import com.example.demo.domain.Tasks;
import com.example.demo.dto.TasksDTO;
import org.springframework.stereotype.Component;

@Component
public class TasksConverter {
    public Tasks fromTasksDtoTasks(TasksDTO tasksDTO){
        Tasks tasks = new Tasks();

        tasks.setID(tasksDTO.getID());
        tasks.setName(tasksDTO.getName());
        tasks.setCreationDate(tasksDTO.getCreationDate());
        tasks.setChangeDate(tasksDTO.getChangeDate());
        tasks.setList(tasksDTO.getList());

        return tasks;
    }

    public TasksDTO fromTasksToTasksDto(Tasks tasks){
        return TasksDTO.builder()
                .ID(tasks.getID())
                .name(tasks.getName())
                .CreationDate(tasks.getCreationDate())
                .ChangeDate(tasks.getChangeDate())
                .list(tasks.getList())
                .build();
    }
}
