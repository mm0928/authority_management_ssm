package com.mm.ssm.service;

import com.mm.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {
    List<Orders> findAll(int page, int size) throws  Exception;

    Orders findById(String ordersId) throws Exception;
}
