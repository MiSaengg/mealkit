package com.example.mealkit.controller;

import com.example.mealkit.dto.MarketDto;
import com.example.mealkit.dto.createMarketDto;
import com.example.mealkit.dto.updateMarketDto;
import com.example.mealkit.model.Market;
import com.example.mealkit.service.MarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "http://localhost:3000")
@RequiredArgsConstructor
@RestController
public class MarketApiController {
    private final MarketService marketService;

    @PostMapping("/api/market")
    public ResponseEntity<Market> addMarket(@RequestBody createMarketDto request){
        Market savedMarket = marketService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedMarket);
    }

    @GetMapping("/api/market")
    public ResponseEntity<List<MarketDto>> findAllMarkets(){
        List<MarketDto> markets = marketService.findAll()
                .stream()
                .map(MarketDto::new)
                .toList();

        return ResponseEntity.ok()
                .body(markets);
    }

    @PutMapping("/api/market/{id}")
    public ResponseEntity<Market> updateMarket(@PathVariable long id, @RequestBody updateMarketDto request){
        Market updatedMarket = marketService.update(id, request);

        return ResponseEntity.ok()
                .body(updatedMarket);
    }
}
