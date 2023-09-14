package com.example.mealkit.dto;

import com.example.mealkit.model.Market;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
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

    public MarketDto(Market market) {
        this.id = market.getId();
        this.name = market.getName();
        this.admin = market.getAdmin();
        this.location = market.getLocation();
        this.password = market.getPassword();
        this.ratingURL = market.getRatingURL();
        this.image = market.getImage();
        this.description = market.getDescription();
        // this.contact = entity.getContact();
    }

}
