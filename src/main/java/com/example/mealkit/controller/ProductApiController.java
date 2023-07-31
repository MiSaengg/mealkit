package com.example.mealkit.controller;

import com.example.mealkit.dto.AddProductRequest;
import com.example.mealkit.dto.ReadProductRequest;
import com.example.mealkit.dto.UpdateProductRequest;
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

    @GetMapping("/api/product/{id}")
    public ResponseEntity<ReadProductRequest> readProduct(@PathVariable Long id){
        Product product = productService.findById(id);
        ReadProductRequest productRequest = new ReadProductRequest(product);

        return ResponseEntity.ok()
                .body(productRequest);
    }

    @PutMapping("/api/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody UpdateProductRequest request){
        Product updatedProduct = productService.update(id, request);

        return ResponseEntity.ok()
                .body(updatedProduct);
    }

    @DeleteMapping("/api/product/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        productService.delete(id);

        return ResponseEntity.noContent().build();
    }


}
