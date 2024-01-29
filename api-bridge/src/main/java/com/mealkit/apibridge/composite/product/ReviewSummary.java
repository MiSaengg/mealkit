package com.mealkit.apibridge.composite.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ReviewSummary {
    private long reviewId;
    private String author;
    private String subject;

}
