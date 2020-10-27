package com.example.demo.dto;

import com.example.demo.domain.Lists;
import lombok.*;

import java.util.*;

@Data
@Builder
public class TasksDTO {
    private UUID ID;
    private String name;
    private Calendar CreationDate;
    private Calendar ChangeDate;
    private Lists list;
}