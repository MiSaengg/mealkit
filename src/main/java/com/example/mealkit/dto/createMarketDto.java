package com.example.mealkit.dto;
import com.example.mealkit.model.Market;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class createMarketDto {
    private String name;
    private Boolean admin;
    private String location; //ex) 1801-1001 RICHARD ST VANCOUVER BC V6B 1J6
    private String password; //encryption
    private String ratingURL; //URL
    private byte[] image;
    private String description;
//  private String contact;

    public Market toEntity(){
        return Market
                .builder()
                .name(name)
                .admin(admin)
                .location(location)
                .password(password)
                .ratingURL(ratingURL)
                .image(image)
                .description(description)
                .build();
    }
}
