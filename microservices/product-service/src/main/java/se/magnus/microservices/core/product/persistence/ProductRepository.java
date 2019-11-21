package se.magnus.microservices.core.product.persistence;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;
import se.magnus.api.core.product.Product;

import java.util.Optional;

@Mapper
@Component
public interface ProductRepository {

    @Select("select * from product where product_id = #{productId}")
    @Results(
            value = {
                    @Result(column = "product_id", property = "productId", javaType = Integer.class, jdbcType = JdbcType.INTEGER)
            }
    )
    ProductEntity findByProductId(int productId);

    @Insert("insert into product(product_id, weight, name) values(#{productId}, #{weight}, #{name})")
    @SelectKey(statement = "SELECT seq id FROM sqlite_sequence WHERE (name = 'product')", before = false, keyProperty = "id", resultType = int.class)
    ProductEntity save(ProductEntity entity);

    @Delete("DELETE FROM product WHERE product_id=#{productId}")
    void delete(ProductEntity entity);

}
