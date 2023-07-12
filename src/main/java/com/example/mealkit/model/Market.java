package com.example.mealkit.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Builder
    public Market(Boolean admin, String name, String location, String password, String ratingURL, byte[] image, String description){
        this.admin = admin;
        this.name = name;
        this.location = location;
        this.password = password;
        this.ratingURL = ratingURL;
        this.image = image;
        this.description = description;
    }

    public void update(String name, String location, String password, String ratingURL, byte[] image, String description ){
        this.name = name;
        this.location = location;
        this.password = password;
        this.ratingURL = ratingURL;
        this.image = image;
        this.description = description;
    }
}
