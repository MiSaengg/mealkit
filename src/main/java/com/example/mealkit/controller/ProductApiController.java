package com.example.mealkit.controller;

import com.example.mealkit.dto.AddProductRequest;
import com.example.mealkit.dto.ReadProductRequest;
import com.example.mealkit.dto.UpdateProductDto;
import com.example.mealkit.model.Product;
import com.example.mealkit.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/api/product")
    public ResponseEntity<List<ReadProductRequest>> readProduct(){
        List<ReadProductRequest> products = productService.findAll()
                .stream()
                .map(ReadProductRequest::new)
                .toList();

        return ResponseEntity.ok()
                .body(products);
    }

    @PostMapping("/api/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody UpdateProductDto request){
        Product updatedProduct = productService.update(id, request);

        return ResponseEntity.ok()
                .body(updatedProduct);
    }

}