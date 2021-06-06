package com.javacto.service.imp;

import com.javacto.mapper.ProductDao;
import com.javacto.po.Product;
import com.javacto.po.ProductExample;
import com.javacto.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductServiceImp implements ProductService {
    @Resource
    private ProductDao productDao;
    @Override
    public List<Product> selectByExample(ProductExample example) {
        return productDao.selectByExample(example);
    }

    @Override
    public int insert(Product record) {
        return productDao.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        String str[]=id.split(",");
        for (String ids:str){
            productDao.deleteByPrimaryKey(ids);
        }
        return productDao.deleteByPrimaryKey(id);
    }

    @Override
    public Product selectByPrimaryKey(String id) {
        return productDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Product record) {
        return productDao.updateByPrimaryKeySelective(record);
    }

}
