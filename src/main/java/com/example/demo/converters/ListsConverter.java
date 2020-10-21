package com.example.demo.converters;

import com.example.demo.domain.Lists;
import com.example.demo.dto.ListsDTO;
import org.springframework.stereotype.Component;

@Component
public class ListsConverter {
    public Lists fromListsDtoToLists(ListsDTO listsDTO){
        Lists lists = new Lists();

        lists.setID(listsDTO.getID());
        lists.setName(listsDTO.getName());
        lists.setCreationDate(listsDTO.getCreationDate());
        lists.setChangeDate(listsDTO.getChangeDate());

        return lists;
    }
    public ListsDTO fromListsToListsDto(Lists lists){
        return ListsDTO.builder()
                .ID(lists.getID())
                .name(lists.getName())
                .CreationDate(lists.getCreationDate())
                .ChangeDate(lists.getChangeDate())
                .build();
    }
}
