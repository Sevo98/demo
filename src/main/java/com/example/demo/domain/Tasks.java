package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
public class Tasks implements Serializable {

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

    @Column(name = "creation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate creation_date;

    @Column(name = "change_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate change_date;

    @Column(name = "urgency")
    private int urgency;

    @Column(name = "complete")
    private Boolean complete;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "listsid", referencedColumnName = "id")//TODO: сделать как сказал наставник
    private Lists listsid;

    public void setID(UUID id) {
        this.id = id;
    }

    public UUID getID() {
        return this.id;
    }

//    public Tasks(String name, Calendar createDate, Calendar changeDate, int urgency, Lists listsid) {
//        this.name = name;
//        CreationDate = createDate;
//        ChangeDate = changeDate;
//        this.urgency = urgency;
//        this.listsid = listsid;
//    }

}
