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
        tasks.setCreateDate(tasksDTO.getCreationDate());
        tasks.setChangeDate(tasksDTO.getChangeDate());
        tasks.setIDList(tasksDTO.getIDList());

        return tasks;
    }

    public TasksDTO fromTasksToTasksDto(Tasks tasks){
        return TasksDTO.builder()
                .ID(tasks.getID())
                .name(tasks.getName())
                .CreationDate(tasks.getCreateDate())
                .ChangeDate(tasks.getChangeDate())
                .IDList(tasks.getIDList())
                .build();
    }
}
