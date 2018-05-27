package com.spring.cloud.eureka.client.dao.first.user;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Select("SELECT name FROM USER WHERE id = #{id}")
    String getUserNameById(@Param("id") Integer id);
}
