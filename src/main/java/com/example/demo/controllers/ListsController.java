package com.example.demo.controllers;


import com.example.demo.dto.ListsDTO;
import com.example.demo.service.ListsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/todo")
@AllArgsConstructor
public class ListsController {

    private final ListsService listsService;

    @PostMapping("/save")
    public ListsDTO saveLists(@RequestBody ListsDTO listsDTO) {
        return listsService.saveLists(listsDTO);
    }

    @GetMapping("/findAll")
    public List<ListsDTO> findAllLists(){
        return listsService.findAll();
    }

    @GetMapping("findByName/{name}")
    public ListsDTO findByName(@PathVariable String name) {
        return listsService.findByName(name);
    }

    @DeleteMapping("/delete/{ID}")
    public ResponseEntity<Void> deleteLists(@PathVariable UUID ID){
        listsService.deleteLists(ID);
        return ResponseEntity.ok().build();
    }
}
