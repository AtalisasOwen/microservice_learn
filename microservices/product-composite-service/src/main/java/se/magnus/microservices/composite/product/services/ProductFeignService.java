package se.magnus.microservices.composite.product.services;

import org.springframework.cloud.openfeign.FeignClient;
import se.magnus.api.core.product.ProductService;

@FeignClient("product-service")
public interface ProductFeignService extends ProductService {
}
