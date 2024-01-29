package com.mealkit.apibridge.core.review;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Review {
    private Long productId;
    private Long reviewId;
    private String author;
    private String subject;
    private String content;
    private String serviceAddress;

    public Review() {
        productId = 0L;
        reviewId = 0L;
        author = null;
        subject = null;
        content = null;
        serviceAddress = null;
    }

}
