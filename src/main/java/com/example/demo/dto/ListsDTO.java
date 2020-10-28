package com.example.demo.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.*;

@Data
@Builder
public class ListsDTO {
    private UUID ID;
    private String name;
    private Calendar CreationDate;
    private Calendar ChangeDate;
}
