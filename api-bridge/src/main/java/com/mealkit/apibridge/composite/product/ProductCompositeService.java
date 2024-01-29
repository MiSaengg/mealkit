package com.mealkit.apibridge.composite.product;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.*;

public interface ProductCompositeService {

    @GetMapping(value = "/api/product-composite/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
    ProductAggregate getProduct(@PathVariable Long productId);
}
