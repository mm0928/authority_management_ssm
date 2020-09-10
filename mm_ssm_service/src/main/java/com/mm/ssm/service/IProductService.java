package com.mm.ssm.service;


import com.mm.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll();


    void save(Product product) throws Exception;
}
