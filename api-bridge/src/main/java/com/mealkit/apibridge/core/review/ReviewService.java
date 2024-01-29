package com.mealkit.apibridge.core.review;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface ReviewService {

    @GetMapping(value = "/api/review" , produces = MediaType.APPLICATION_JSON_VALUE)
    List<Review> getReviews(@RequestParam(value="productId", required =  true) Long productId);
}
