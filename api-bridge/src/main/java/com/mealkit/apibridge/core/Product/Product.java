package com.mealkit.apibridge.core.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Product{
    private Long productId;
    private String name;
    private int weight;
    private String serviceAddress;

    public Product() {
        productId = 0L;
        name = null;
        weight = 0;
        serviceAddress = null;
    }
}