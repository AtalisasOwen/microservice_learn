package se.magnus.microservices.composite.product.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import se.magnus.api.core.product.Product;
import se.magnus.api.core.product.ProductService;
import se.magnus.api.core.recommendation.Recommendation;
import se.magnus.api.core.recommendation.RecommendationService;
import se.magnus.api.core.review.Review;
import se.magnus.api.core.review.ReviewService;

import java.util.List;

@Component
public class ProductCompositeFeignIntegration implements ProductService, RecommendationService, ReviewService {

    private static final Logger LOG = LoggerFactory.getLogger(ProductCompositeFeignIntegration.class);
    private final ProductFeignService productFeignService;
    private final RecommendationFeignService recommendationFeignService;
    private final ReviewFeignService reviewFeignService;

    @Autowired
    public ProductCompositeFeignIntegration(ProductFeignService productFeignService, RecommendationFeignService recommendationFeignService, ReviewFeignService reviewFeignService) {
        this.productFeignService = productFeignService;
        this.recommendationFeignService = recommendationFeignService;
        this.reviewFeignService = reviewFeignService;
    }

    @Override
    public Product createProduct(Product body) {
        return this.productFeignService.createProduct(body);
    }

    @Override
    public Product getProduct(int productId) {
        return this.productFeignService.getProduct(productId);
    }

    @Override
    public void deleteProduct(int productId) {
        this.productFeignService.deleteProduct(productId);
    }

    @Override
    public Recommendation createRecommendation(Recommendation body) {
        return this.recommendationFeignService.createRecommendation(body);
    }

    @Override
    public List<Recommendation> getRecommendations(int productId) {
        return this.recommendationFeignService.getRecommendations(productId);
    }

    @Override
    public void deleteRecommendations(int productId) {
        this.recommendationFeignService.deleteRecommendations(productId);
    }

    @Override
    public Review createReview(Review body) {
        return reviewFeignService.createReview(body);
    }

    @Override
    public List<Review> getReviews(int productId) {
        return reviewFeignService.getReviews(productId);
    }

    @Override
    public void deleteReviews(int productId) {
        reviewFeignService.deleteReviews(productId);
    }
}
