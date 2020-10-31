package com.example.demo.dto;

import com.example.demo.domain.Lists;
import lombok.*;

import java.time.LocalDate;
import java.util.*;

@Data
@Builder
public class TasksDTO {
    private UUID ID;
    private String name;
    private LocalDate creation_date;
    private LocalDate change_date;
    private int urgency;
    private UUID listsid;
    private Boolean complete;
}