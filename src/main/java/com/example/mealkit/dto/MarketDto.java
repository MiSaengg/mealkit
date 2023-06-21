package com.example.mealkit.dto;

import com.example.mealkit.model.Market;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MarketDto {
    private Long id;
    private String name;
    private Boolean admin;
    private String location;
    private String password;
    private String ratingURL;
    private byte[] image;
    private String description;
    // private String contact;

    public MarketDto(Market entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.admin = entity.getAdmin();
        this.location = entity.getLocation();
        this.password = entity.getPassword();
        this.ratingURL = entity.getRatingURL();
        this.image = entity.getImage();
        this.description = entity.getDescription();
        // this.contact = entity.getContact();
    }
}
