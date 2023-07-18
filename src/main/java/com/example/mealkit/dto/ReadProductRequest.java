package com.example.mealkit.dto;

import com.example.mealkit.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReadProductRequest {
    private Long product_id;
    private String product_name;

    public ReadProductRequest(Product product){
        this.product_id = product.getProduct_id();
        this.product_name = product.getProduct_name();
    }
}
