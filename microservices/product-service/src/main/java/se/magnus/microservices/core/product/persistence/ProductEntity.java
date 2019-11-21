package se.magnus.microservices.core.product.persistence;

import lombok.Data;

@Data
public class ProductEntity {
    private int id;
    private int productId;
    private int weight;
    private String name;
}
