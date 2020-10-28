package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @Column(name = "CreationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Calendar CreationDate;

    @Column(name = "ChangeDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Calendar ChangeDate;

    @Column(name = "urgency")
    private int urgency;

    @Column(name = "complete")
    private Boolean complete;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "listsid", referencedColumnName = "id")//TODO: сделать как сказал наставник
    private Lists list;

    public Tasks(String name, Calendar createDate, Calendar changeDate, int urgency, Lists list) {
        this.name = name;
        CreationDate = createDate;
        ChangeDate = changeDate;
        this.urgency = urgency;
        this.list = list;
    }

}
