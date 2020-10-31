package com.example.demo.converters;

import com.example.demo.domain.Lists;
import com.example.demo.domain.Tasks;
import com.example.demo.dto.TasksDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TasksConverter {
    public Tasks fromTasksDtoTasks(TasksDTO tasksDTO){
        Tasks tasks = new Tasks();
//        Lists tempList = new Lists();

//        tempList.setID(tasksDTO.getID());

        LocalDate now = LocalDate.now();

        tasks.setID(tasksDTO.getID());
        tasks.setName(tasksDTO.getName());
        tasks.setCreation_date(now);
        tasks.setChange_date(now);
        tasks.setUrgency(tasksDTO.getUrgency());
//        tasks.setListsid(tempList);
        tasks.setComplete(tasksDTO.getComplete());

        return tasks;
    }

    public TasksDTO fromTasksToTasksDto(Tasks tasks){
        return TasksDTO.builder()
                .ID(tasks.getID())
                .name(tasks.getName())
                .creation_date(tasks.getCreation_date())
                .change_date(tasks.getChange_date())
                .urgency(tasks.getUrgency())
//                .listsid(tasks.getListsid().getID())
                .complete(tasks.getComplete())
                .build();
    }
}
