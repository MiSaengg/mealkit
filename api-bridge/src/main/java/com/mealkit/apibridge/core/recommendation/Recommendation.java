package com.mealkit.apibridge.core.recommendation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Recommendation {
    private long productId;
    private long recommendationId;
    private String author;
    private int rate;
    private String content;
    private String serviceAddress;
}
