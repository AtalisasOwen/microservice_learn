package se.magnus.microservices.core.product.services;

import org.springframework.stereotype.Component;
import se.magnus.api.core.product.Product;
import se.magnus.microservices.core.product.persistence.ProductEntity;


@Component
public class ProductMapper {
    Product entityToApi(ProductEntity entity){
        Product product = new Product();
        product.setName(entity.getName());
        product.setProductId(entity.getProductId());
        product.setWeight(entity.getWeight());
        return product;
    }


    ProductEntity apiToEntity(Product api){
        ProductEntity entity = new ProductEntity();
        entity.setName(api.getName());
        entity.setProductId(api.getProductId());
        entity.setWeight(api.getWeight());
        return entity;
    }
}
