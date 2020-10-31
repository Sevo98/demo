package com.example.demo.converters;

import com.example.demo.domain.Lists;
import com.example.demo.dto.ListsDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ListsConverter {
    public Lists fromListsDtoToLists(ListsDTO listsDTO){
        Lists lists = new Lists();

        LocalDate now = LocalDate.now();

        lists.setID(listsDTO.getID());
        lists.setName(listsDTO.getName());
        lists.setCreation_date(now);
        lists.setChange_date(listsDTO.getChange_date());

        return lists;
    }
    public ListsDTO fromListsToListsDto(Lists lists){
        return ListsDTO.builder()
                .ID(lists.getID())
                .name(lists.getName())
                .creation_date(lists.getCreation_date())
                .change_date(lists.getChange_date())
                .build();
    }
}
