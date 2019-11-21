package se.magnus.microservices.core.recommendation.persistence;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import se.magnus.api.core.recommendation.Recommendation;

import java.util.List;
@Repository
@Mapper
public interface RecommendationRepository {

    @Insert("insert into recommendation(author, content, product_id, recomm_id, rate) values (#{author}, #{content}, #{productId}, #{recommendationId}, #{rate})")
    void save(Recommendation recomm);

    @Delete("delete from recommendation where product_id = #{productId}")
    void deleteAll(int productId);

    @Select("select * from recommendation where product_id = #{productId}")
    @Results(
            value = {
                    @Result(column = "product_id",property = "productId", javaType = int.class, jdbcType = JdbcType.INTEGER),
                    @Result(column = "recomm_id",property = "recommendationId", javaType = int.class, jdbcType = JdbcType.INTEGER)
            }
    )
    List<Recommendation> findByProductId(int productId);

}
