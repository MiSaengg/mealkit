package com.example.mealkit.repository;

import com.example.mealkit.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarketRepository extends JpaRepository<Market, Long> {
}
