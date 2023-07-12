package com.example.mealkit.repository;

import com.example.mealkit.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Long>{
}
