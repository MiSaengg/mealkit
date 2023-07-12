package com.example.mealkit.controller;

import com.example.mealkit.dto.AddProductRequest;
import com.example.mealkit.model.Product;
import com.example.mealkit.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "http://localhost:3000")
@RequiredArgsConstructor
@RestController
public class ProductApiController {
    private final ProductService productService;

    @PostMapping("/api/product")
    public ResponseEntity<Product> addProduct(@RequestBody AddProductRequest request){
        Product savedProduct = productService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedProduct);
    }

}
