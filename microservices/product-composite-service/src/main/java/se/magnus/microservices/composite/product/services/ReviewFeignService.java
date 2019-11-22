package se.magnus.microservices.composite.product.services;

import org.springframework.cloud.openfeign.FeignClient;
import se.magnus.api.core.review.ReviewService;

@FeignClient("review-service")
public interface ReviewFeignService extends ReviewService {
}
