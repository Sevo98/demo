package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
public class Tasks implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private UUID ID;

    @Column(name = "Name")
    private String name;

    @Column(name = "create_date")
    private Calendar CreateDate;

    @Column(name = "change_date")
    private Calendar ChangeDate;

    @Column(name = "done")
    private boolean done;

    @Column(name = "IDList")
    private UUID IDList;


    public Tasks(String name, Calendar createDate, Calendar changeDate, boolean done, UUID IDList) {
        this.name = name;
        CreateDate = createDate;
        ChangeDate = changeDate;
        this.done = done;
        this.IDList = IDList;
    }

}
