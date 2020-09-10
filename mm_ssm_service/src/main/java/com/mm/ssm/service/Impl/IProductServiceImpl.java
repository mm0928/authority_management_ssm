package com.mm.ssm.service.Impl;

import com.mm.ssm.service.IProductService;
import com.mm.ssm.dao.IProductDao;
import com.mm.ssm.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;



    @Override
    public List<Product> findAll(){
        return productDao.findAll() ;
    }

    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }


}
