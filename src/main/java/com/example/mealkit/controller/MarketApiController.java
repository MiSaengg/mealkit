package com.example.mealkit.controller;

import com.example.mealkit.dto.MarketDto;
import com.example.mealkit.dto.CreateMarketDto;
import com.example.mealkit.dto.UpdateMarketDto;
import com.example.mealkit.model.Market;
import com.example.mealkit.service.MarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(value = "http://localhost:3000")
@RequiredArgsConstructor
@RestController
public class MarketApiController {
    private final MarketService marketService;

    @PostMapping("/api/market")
    public ResponseEntity<Market> addMarket(@RequestBody CreateMarketDto request){
        Market savedMarket = marketService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedMarket);
    }

    @GetMapping("/api/market")
    public ResponseEntity<?> findMarkets(@RequestParam(value= "name", required = false) String name,
                                         @RequestParam(value= "location", required = false) String location,
                                         @RequestParam(value= "ratingURL", required = false) String ratingURL) {
        try {
            List<Market> markets = marketService.findByQuery(name, location, ratingURL);
            if (markets.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("market not found based on query");
            }
            List<MarketDto> marketDto = markets.stream()
                    .map(MarketDto::new)
                    .collect(Collectors.toList());
            return ResponseEntity.ok().body(marketDto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error: " + e.getMessage());
        }
    }



    @GetMapping("/api/market/{id}")
    public ResponseEntity<MarketDto> findMarketById(@PathVariable long id){
        MarketDto market = new MarketDto(marketService.findById(id));

        return ResponseEntity.ok()
                .body(market);
    }

    @PutMapping("/api/market/{id}")
    public ResponseEntity<Market> updateMarket(@PathVariable long id, @RequestBody UpdateMarketDto request){
        Market updatedMarket = marketService.update(id, request);

        return ResponseEntity.ok()
                .body(updatedMarket);
    }

    @DeleteMapping("/api/market/{id}")
    public ResponseEntity<Void> deleteMarket(@PathVariable long id){
        marketService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
