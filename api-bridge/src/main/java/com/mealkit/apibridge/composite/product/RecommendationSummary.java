package com.mealkit.apibridge.composite.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RecommendationSummary {
    private long recommendationId;
    private String author;
    private int rate;
}
