package com.mealkit.apibridge.core.Product;

import com.mealkit.apibridge.core.Product.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.*;


/**
 *
 */
public interface ProductService {
    @GetMapping(value = "/api/product/{productId}",
    produces = MediaType.APPLICATION_JSON_VALUE)
    Product getProduct(@PathVariable("productId") Long productId);
}