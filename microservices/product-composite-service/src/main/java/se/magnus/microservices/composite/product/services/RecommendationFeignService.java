package se.magnus.microservices.composite.product.services;

import org.springframework.cloud.openfeign.FeignClient;
import se.magnus.api.core.recommendation.RecommendationService;

@FeignClient("recommendation-service")
public interface RecommendationFeignService extends RecommendationService {
}
