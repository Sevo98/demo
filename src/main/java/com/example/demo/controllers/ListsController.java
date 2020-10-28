package com.example.demo.controllers;


import com.example.demo.domain.Lists;
import com.example.demo.dto.ListsDTO;
import com.example.demo.service.*;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/todo")
@AllArgsConstructor
public class ListsController {

    private static final int DEFAULT_LIMIT = 10;

    private final ListsServiceImpl listsServiceImpl;

    @PostMapping("/save")
    public ListsDTO saveLists(@RequestBody ListsDTO listsDTO) {
        return listsServiceImpl.saveLists(listsDTO);
    }


    /**
     * Поиск всех списков
     *
     * @param page номер страницы
     * @param limit количество элементов на странице
     * @param orderBy по какому элементу сортировать
     * @param order метод сортировки ASC or DESC
     * @return возвращет страницу со списками
     */

    @GetMapping
    public ResponseEntity<Page<Lists>> lists(@RequestParam Optional<Integer> page,
            @RequestParam Optional<Integer> limit,
            @RequestParam Optional<String> orderBy,
            @RequestParam Optional<String> order){

        if(limit.isPresent() && limit.get() > 100){
            limit = Optional.of(DEFAULT_LIMIT);
        }

        Pageable pageable = PageRequest.of(page.orElse(0),
                limit.orElse(DEFAULT_LIMIT),
                Sort.Direction.fromString(order.orElse("ASC")),
                orderBy.orElse("id"));
        Page<Lists> listPage = listsServiceImpl.lists(pageable);

        return listPage != null && !listPage.isEmpty()
                ? new ResponseEntity<>(listPage, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping
    public ResponseEntity<ListsDTO> updateLists(@RequestParam UUID id, @RequestParam String name){
        listsServiceImpl.updateLists(id, name);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findAll")
    public List<ListsDTO> findAllLists(){
        return listsServiceImpl.findAll();
    }

    @GetMapping("findByName/{name}")
    public ListsDTO findByName(@PathVariable String name) {
        return listsServiceImpl.findByName(name);
    }

    @DeleteMapping("/delete/{ID}")
    public ResponseEntity<Void> deleteLists(@PathVariable UUID ID){
        listsServiceImpl.deleteLists(ID);
        return ResponseEntity.ok().build();
    }
}
