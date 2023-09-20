package com.example.mealkit.repository;

import com.example.mealkit.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface MarketRepository extends JpaRepository<Market, Long> {
    @Query("SELECT m FROM Market m WHERE " +
            "(:name IS NULL OR m.name = :name) AND " +
            "(:location IS NULL OR m.location = :location) AND " +
            "(:ratingURL IS NULL OR m.ratingURL = :ratingURL)")
    List<Market> findByQuery(@Param("name") String name,
                             @Param("location") String location,
                             @Param("ratingURL") String ratingURL);
}


