package com.mealkit.apibridge.core.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Product{
    private final Long productId;
    private final String name;
    private final int weight;
    private final String serviceAddress;

    public Product(){
        this.productId = null;
        this.name = null;
        this.weight = 0;
        this.serviceAddress = null;
    }

}