package se.magnus.microservices.core.product.persistence;

import lombok.Data;

@Data
public class ProductEntity {
    private String id;
    private int productId;
    private int weight;
    private String name;
}
