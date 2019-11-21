package se.magnus.microservices.core.recommendation.persistence;

import se.magnus.api.core.recommendation.Recommendation;

import java.util.List;

public interface RecommendationRepository {


    Recommendation save(Recommendation recomm);

    void deleteAll(List<Recommendation> recommendations);

    List<Recommendation> findByProductId(int productId);

}
