package com.example.demo.service;

import com.example.demo.dto.ListsDTO;

import java.util.*;

public interface ListsService {
    ListsDTO saveLists(ListsDTO listsDTO);
    void deleteLists(int ID);
    ListsDTO findByName(String name);
    List<ListsDTO> findAll();

}
