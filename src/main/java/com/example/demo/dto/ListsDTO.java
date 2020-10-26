package com.example.demo.dto;

import lombok.*;

import java.util.*;

/**
 * Java-doc и на поля тоже
 */
@Data
@Builder
public class ListsDTO { // TODO: camelCase - ListsDTO->ListsDto
    private UUID ID;
    private String name;
    private Calendar CreationDate;
    private Calendar ChangeDate;
    // так же можно вставить сюда вычисляемое из дел значние - статус списка (если хоть одно не закрыто, то и список не закрыт)
}
