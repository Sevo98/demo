package com.example.demo.service;

import com.example.demo.converters.ListsConverter;
import com.example.demo.domain.Lists;
import com.example.demo.dto.ListsDTO;
import com.example.demo.repository.ListsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ListsServiceImpl implements ListsService {

    private final ListsRepository listsRepository;

    private final ListsConverter listsConverter;

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final String SQL_UPDATE = "UPDATE list SET name = ? WHERE id = ?";

    @Override
    public ListsDTO saveLists(ListsDTO listsDTO) {
        Lists savedLists = listsRepository.save(listsConverter.fromListsDtoToLists(listsDTO));
        return listsConverter.fromListsToListsDto(savedLists);
    }

    @Override
    public void deleteLists(UUID listsID) {
        listsRepository.deleteById(listsID);
    }

    @Override
    public ListsDTO findByName(String name) {
        Lists lists = listsRepository.findByName(name);
        if (lists != null) {
            return listsConverter.fromListsToListsDto(lists);
        }
        return null;
    }

    @Override
    public Page<Lists> lists(Pageable pageable) {
        return listsRepository.findAll(pageable);
    }

    @Override
    public List<ListsDTO> findAll() {
        return listsRepository.findAll()
                .stream()
                .map(listsConverter::fromListsToListsDto)
                .collect(Collectors.toList());
    }

    @Override
    public void updateLists(UUID id, String name) {
        jdbcTemplate.update(SQL_UPDATE, new Object[]{name, id});
    }
}
