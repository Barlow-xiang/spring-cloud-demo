package com.spring.cloud.eureka.client.dao.second.order;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 *  order dao
 * @author xiang
 */
@Repository
public interface OrderDao {

    @Select("SELECT name FROM `order` WHERE id = #{id}")
    String getOrderNameById(@Param("id") Integer id);
}
