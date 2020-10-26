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

    @Column(name = "ChangeDate") // TODO: имена полей в базе в формате create_date и лучше большими буквами. в java коде camelCase
    private Calendar ChangeDate;

    @Column(name = "IDList")
    private UUID IDList; // тут не так, тут private Lists list; почитайте про аннотации @ManyToOne @JoinColumn

    // TODO: @AllArgConstructor аннотация lombok
    public Tasks(){

    }

    public Tasks(String name, Calendar createDate, Calendar changeDate, UUID IDList) {
        this.name = name;
        CreateDate = createDate;
        ChangeDate = changeDate;
        this.IDList = IDList;
    }

    // TODO: тут и ниже все методы можно хзаменить на @Getter/@Setter аннотации lombok
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
