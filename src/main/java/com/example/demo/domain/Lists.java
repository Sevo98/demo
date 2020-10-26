package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * Java-doc
 */
@Entity
@Table (name = "List")
@Data
@NoArgsConstructor
public class Lists implements Serializable { // TODO: лучше в единственном числе

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    ) // TODO: проще в конструкторе при создании давайть UUID
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "Name") // TODO: тут и далее в именах таблиц и колонок лучше использовать верхний регистр в формате XXX_YYY_ZZZ
    private String name;

    @Column(name = "CreationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Calendar CreationDate;

    @Column(name = "ChangeDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Calendar ChangeDate;

    public Lists(String name, Calendar creationDate, Calendar changeDate) {
        this.name = name;
        CreationDate = creationDate;
        ChangeDate = changeDate;
    }

    public void setID(UUID id) {
        this.id = id;
    }
    // TODO: разве геттеры/серреты в @Data не входят ???
    public UUID getID() {
        return this.id;
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
