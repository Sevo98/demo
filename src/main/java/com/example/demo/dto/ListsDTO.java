package com.example.demo.dto;

import lombok.*;

import java.util.*;

@Data
@Builder
public class ListsDTO {
    private int ID;
    private String name;
    private Calendar CreationDate;
    private Calendar ChangeDate;
}
