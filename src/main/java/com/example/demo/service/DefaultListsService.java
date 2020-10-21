package com.example.demo.service;

import com.example.demo.converters.ListsConverter;
import com.example.demo.domain.Lists;
import com.example.demo.dto.ListsDTO;
import com.example.demo.repository.ListsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class DefaultListsService implements ListsService {
    private final ListsRepository listsRepository;
    private final ListsConverter listsConverter;

    @Override
    public ListsDTO saveLists(ListsDTO listsDTO) {
        Lists savedLists = listsRepository.save(listsConverter.fromListsDtoToLists(listsDTO));
        return listsConverter.fromListsToListsDto(savedLists);
    }

    @Override
    public void deleteLists(int listsID){
        listsRepository.deleteById(listsID);
    }
    @Override
    public ListsDTO findByName(String name){
        Lists lists = listsRepository.findByName(name);
        if (lists != null) {
            return listsConverter.fromListsToListsDto(lists);
        }
        return null;
    }
    @Override
    public List<ListsDTO> findAll(){
        return listsRepository.findAll()
                .stream()
                .map(listsConverter::fromListsToListsDto)
                .collect(Collectors.toList());
    }
}
