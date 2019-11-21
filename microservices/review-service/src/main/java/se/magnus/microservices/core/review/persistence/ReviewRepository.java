package se.magnus.microservices.core.review.persistence;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import se.magnus.api.core.review.Review;

import java.util.List;

@Repository
@Mapper
public interface ReviewRepository {

    @Select("select * from reviews where product_id = #{productId}")
    @Results(
            value = {
                    @Result(column = "product_id",property = "productId", javaType = int.class, jdbcType = JdbcType.INTEGER),
                    @Result(column = "review_id",property = "reviewId", javaType = int.class, jdbcType = JdbcType.INTEGER)
            }
    )
    List<Review> findByProductId(int productId);

    @Delete("delete from reviews where product_id = #{productId}")
    void deleteAll(int productId);

    @Insert("insert into reviews(author, content, subject, product_id, review_id) values (#{author}, #{content}, #{subject}, #{productId}, #{reviewId})")
    void save(Review review);

}
