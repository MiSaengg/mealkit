package com.example.mealkit.service;

import com.example.mealkit.dto.AddProductRequest;
import com.example.mealkit.dto.UpdateProductRequest;
import com.example.mealkit.model.Product;
import com.example.mealkit.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.NoSuchElementException;
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

    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Product not found"));
    }

    @Transactional
    public Product update(Long id, UpdateProductRequest request) {
        Product product = findById(id);
        product.update(request);
        return product;
    }

    public void delete(Long id) {
        Product product = findById(id);
        productRepository.delete(product);
    }
}
