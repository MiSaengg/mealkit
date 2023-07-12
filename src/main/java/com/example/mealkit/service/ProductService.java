package com.example.mealkit.service;

import com.example.mealkit.dto.AddProductRequest;
import com.example.mealkit.model.Product;
import com.example.mealkit.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public Product save(AddProductRequest request){
        return productRepository.save(request.toEntity());
    }
}
