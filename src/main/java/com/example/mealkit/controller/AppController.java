package com.example.mealkit.controller;

import com.example.mealkit.dto.MarketDto;
import com.example.mealkit.model.Market;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    Logger logger = LoggerFactory.getLogger(AppController.class);

    @Value("Hello")
    private String name;

    @GetMapping("/api/test")
    public String getRoot() {
        logger.info(name);
        //Using http : 8000 to activate (using httpie)

        System.out.println("HEKKOO");
        return "Hello NextJS";
    }
}
