package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table (name = "List")
@Data
@NoArgsConstructor
public class Lists implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "Name")
    private String name;

//    @Column(name = "ChangeDate")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
//    private LocalDateTime ChangeDate = LocalDateTime.now();
//
//    @Column(name = "CreationDate")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
//    private LocalDateTime CreationDate = LocalDateTime.now();


    @Column(name = "CreationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Calendar CreationDate = Calendar.getInstance();

    @Column(name = "ChangeDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Calendar ChangeDate = Calendar.getInstance();


    public Lists(String name, Calendar creationDate, Calendar changeDate) {
        this.name = name;
        CreationDate = creationDate;
        ChangeDate = changeDate;
    }

    public void setID(UUID id) {
        this.id = id;
    }

    public UUID getID() {
        return this.id;
    }

}
