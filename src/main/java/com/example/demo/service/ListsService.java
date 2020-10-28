package com.example.demo.service;

import com.example.demo.domain.Lists;
import com.example.demo.dto.ListsDTO;
import org.springframework.data.domain.*;

import java.util.*;

public interface ListsService {
    ListsDTO saveLists(ListsDTO listsDTO);
    void deleteLists(UUID ID);
    ListsDTO findByName(String name);

    Page<Lists> lists(Pageable pageable);

    List<ListsDTO> findAll();

}
