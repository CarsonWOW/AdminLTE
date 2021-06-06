package com.javacto.service;

import com.javacto.po.Product;
import com.javacto.po.ProductExample;

import java.util.List;

public interface ProductService {
    List<Product> selectByExample(ProductExample example);
    int insert(Product record);
    int deleteByPrimaryKey(String id);
    Product selectByPrimaryKey(String id);
    int updateByPrimaryKeySelective(Product record);
}
