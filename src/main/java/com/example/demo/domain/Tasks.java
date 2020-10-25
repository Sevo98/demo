package com.example.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "tasks")
public class Tasks implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private UUID ID;

    @Column(name = "Name")
    private String name;

    @Column(name = "create_date")
    private Calendar CreateDate;

    @Column(name = "ChangeDate")
    private Calendar ChangeDate;

    @Column(name = "IDList")
    private UUID IDList;

    public Tasks(){

    }

    public Tasks(String name, Calendar createDate, Calendar changeDate, UUID IDList) {
        this.name = name;
        CreateDate = createDate;
        ChangeDate = changeDate;
        this.IDList = IDList;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Calendar createDate) {
        CreateDate = createDate;
    }

    public Calendar getChangeDate() {
        return ChangeDate;
    }

    public void setChangeDate(Calendar changeDate) {
        ChangeDate = changeDate;
    }

    public UUID getIDList() {
        return IDList;
    }

    public void setIDList(UUID IDList) {
        this.IDList = IDList;
    }


}
