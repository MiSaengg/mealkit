package com.example.mealkit.service;

import com.example.mealkit.dto.AddProductRequest;
import com.example.mealkit.dto.UpdateProductDto;
import com.example.mealkit.model.Product;
import com.example.mealkit.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public Product save(AddProductRequest request){
        return productRepository.save(request.toEntity());
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product update(long id, UpdateProductDto request){
        Product product = productRepository.findById(id)
                .orElseThrow( () -> new IllegalArgumentException("not found : " + id));

        product.update(request.getProduct_name());

        return product;

    }
}
