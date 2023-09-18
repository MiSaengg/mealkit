package com.example.mealkit.service;

import com.example.mealkit.dto.AddProductRequest;
import com.example.mealkit.dto.UpdateProductDto;
import com.example.mealkit.model.Market;
import com.example.mealkit.model.Product;
import com.example.mealkit.repository.MarketRepository;
import com.example.mealkit.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final MarketRepository marketRepository;

    public Product save(AddProductRequest request, long id){
        Market market = marketRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Not found Market : " + id));
        System.out.println(market);

        return productRepository.save(request.toEntity(market));
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