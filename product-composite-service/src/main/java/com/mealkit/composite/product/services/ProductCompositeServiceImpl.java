package com.mealkit.composite.product.services;

import com.mealkit.apibridge.composite.product.*;
import com.mealkit.apibridge.core.Product.Product;
import com.mealkit.apibridge.core.recommendation.Recommendation;
import com.mealkit.apibridge.core.review.Review;
import com.mealkit.util.exception.NotFoundException;
import com.mealkit.util.http.ServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductCompositeServiceImpl implements ProductCompositeService {

    private final ServiceUtil serviceUtil;
    private  ProductCompositeIntegration integration;

    @Autowired
    public ProductCompositeServiceImpl(ServiceUtil serviceUtil, ProductCompositeIntegration integration) {
        this.serviceUtil = serviceUtil;
        this.integration = integration;
    }

    @Override
    public ProductAggregate getProduct(Long productId) {

        Product product = integration.getProduct(productId);
        if (product == null) throw new NotFoundException("No product found for productId: " + productId);

        List<Recommendation> recommendations = integration.getRecommendations(productId);

        List<Review> reviews = integration.getReviews(productId);

        return createProductAggregate(product, recommendations, reviews, serviceUtil.getServiceAddress());
    }

    private ProductAggregate createProductAggregate(Product product, List<Recommendation> recommendations, List<Review> reviews, String serviceAddress) {

        // 1. Setup product info
        Long productId = product.getProductId();
        String name = product.getName();
        int weight = product.getWeight();

        // 2. Copy summary recommendation info, if available
        List<RecommendationSummary> recommendationSummaries = (recommendations == null) ? null :
                recommendations.stream()
                        .map(r -> new RecommendationSummary(r.getRecommendationId(), r.getAuthor(), r.getRate()))
                        .collect(Collectors.toList());

        // 3. Copy summary review info, if available
        List<ReviewSummary> reviewSummaries = (reviews == null)  ? null :
                reviews.stream()
                        .map(r -> new ReviewSummary(r.getReviewId(), r.getAuthor(), r.getSubject()))
                        .collect(Collectors.toList());

        // 4. Create info regarding the involved microservices addresses
        String productAddress = product.getServiceAddress();
        String reviewAddress = (reviews != null && reviews.size() > 0) ? reviews.get(0).getServiceAddress() : "";
        String recommendationAddress = (recommendations != null && recommendations.size() > 0) ? recommendations.get(0).getServiceAddress() : "";
        ServiceAddresses serviceAddresses = new ServiceAddresses(serviceAddress, productAddress, reviewAddress, recommendationAddress);

        return new ProductAggregate(productId, name, weight, recommendationSummaries, reviewSummaries, serviceAddresses);
    }

}
