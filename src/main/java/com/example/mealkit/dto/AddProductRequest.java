package com.example.mealkit.dto;

import com.example.mealkit.model.Market;
import com.example.mealkit.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddProductRequest {
    private String product_name;
    private Market market;

    public Product toEntity(){
        return Product
                .builder()
                .product_name(product_name)
                .market(market)
                .build();
    }
}
