package com.example.mealkit.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "market")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Boolean admin;

    @Column
    private String name;

    @Column
    private String location; //ex) 1801-1001 RICHARD ST VANCOUVER BC V6B 1J6

    @Column
    private String password; //encryption

    @Column
    private String ratingURL; //URL

    @Column
    private byte[] image;

    @Column
    private String description;

//    @Column
//    private String contact;
}
