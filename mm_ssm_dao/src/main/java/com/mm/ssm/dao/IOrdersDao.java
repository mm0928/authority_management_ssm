package com.mm.ssm.dao;


import com.mm.ssm.domain.Orders;
import com.mm.ssm.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IOrdersDao {

    @Select("select * from orders")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column ="orderNum", property = "orderNum" ),
            @Result(column = "orderStatus", property = "orderStatus"),
            @Result(column = "peopleCount", property = "peopleCount"),
            @Result(column = "payType", property = "payType"),
            @Result(column = "orderDesc", property = "orderDesc"),
            @Result(column = "productId", property = "product", javaType = Product.class, one = @One(select = "com.mm.ssm.dao.IProductDao.findById"))
        })
    public List<Orders> findAll();


    @Select("select * from orders where id = #{ordersId}")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column ="orderNum", property = "orderNum" ),
            @Result(column = "orderStatus", property = "orderStatus"),
            @Result(column = "peopleCount", property = "peopleCount"),
            @Result(column = "payType", property = "payType"),
            @Result(column = "orderDesc", property = "orderDesc"),
            @Result(column = "productId", property = "product", javaType = Product.class, one = @One(select = "com.mm.ssm.dao.IProductDao.findById")),
            @Result(column = "id", property = "travellers", javaType = List.class, many = @Many(select = "com.mm.ssm.dao.ITravellerDao.findByOrdersId"))
    })
    public Orders findById(String ordersId) throws  Exception;
}
