package com.mm.ssm.dao;

import com.mm.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

public interface ITravellerDao {

    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId = #{ordersId})")
    public Traveller findByOrdersId(String id)throws Exception;
}
