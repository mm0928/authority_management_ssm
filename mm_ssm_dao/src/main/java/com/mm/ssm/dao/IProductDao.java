package com.mm.ssm.dao;


import com.mm.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {


    @Select("select * from product")
    public List<Product> findAll();

    @Select("select * from product where id = #{id}")
    public Product findById(String id) throws Exception;



    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product) throws Exception;
}
