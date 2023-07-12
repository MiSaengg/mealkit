package com.example.mealkit.service;

import com.example.mealkit.dto.CreateMarketDto;
import com.example.mealkit.dto.UpdateMarketDto;
import com.example.mealkit.model.Market;
import com.example.mealkit.repository.MarketRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MarketService {
    private final MarketRepository marketRepository;

    public Market save(CreateMarketDto request){
        return marketRepository.save(request.toEntity());
    }

    public List<Market> findAll(){
        return marketRepository.findAll();
    }

    @Transactional
    public Market update(long id, UpdateMarketDto request){
        Market market = marketRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found:" +id));

        market.update(request.getName() , request.getLocation() , request.getPassword(), request.getRatingURL(),request.getImage(),request.getDescription());

        return market;
    }
}
