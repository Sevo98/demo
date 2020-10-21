package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table (name = "List")
@Data
@NoArgsConstructor
public class Lists implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;

    @Column(name = "Name")
    private String name;

    @Column(name = "CreationDate")
    private Calendar CreationDate;

    @Column(name = "ChangeDate")
    private Calendar ChangeDate;


    public Lists(String name, Calendar creationDate, Calendar changeDate) {
        this.name = name;
        CreationDate = creationDate;
        ChangeDate = changeDate;
    }

//    public UUID getID() {
//        return ID;
//    }
//
//    public void setID(UUID ID) {
//        this.ID = ID;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Calendar getCreationDate() {
//        return CreationDate;
//    }
//
//    public void setCreationDate(Calendar creationDate) {
//        CreationDate = creationDate;
//    }
//
//    public Calendar getChangeDate() {
//        return ChangeDate;
//    }
//
//    public void setChangeDate(Calendar changeDate) {
//        ChangeDate = changeDate;
//    }

}
