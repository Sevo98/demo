package com.example.demo.dto;

import lombok.*;

import java.util.*;

@Data
@Builder
public class TasksDTO {
    private UUID ID;
    private String name;
    private Calendar CreationDate;
    private Calendar ChangeDate;
    private UUID IDList;
}