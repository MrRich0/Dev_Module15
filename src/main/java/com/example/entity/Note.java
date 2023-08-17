package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "note")
@Entity
@Data
public class Note {
    @Id
    private long id;
    @Column
    private String title;
    @Column
    private String content;

}
