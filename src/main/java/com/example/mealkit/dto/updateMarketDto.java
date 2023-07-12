package com.example.mealkit.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class updateMarketDto {
    private String name;
    private Boolean admin;
    private String location; //ex) 1801-1001 RICHARD ST VANCOUVER BC V6B 1J6
    private String password; //encryption
    private String ratingURL; //URL
    private byte[] image;
    private String description;
//  private String contact;
}