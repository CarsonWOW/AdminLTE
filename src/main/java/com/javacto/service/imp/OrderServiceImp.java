package com.javacto.service.imp;

import com.javacto.mapper.OrdersDao;
import com.javacto.po.Orders;
import com.javacto.po.OrdersExample;
import com.javacto.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class OrderServiceImp implements OrderService {
    @Resource
    private OrdersDao ordersDao;
    @Override
    public List<Orders> selectByExample(OrdersExample example) {
        return ordersDao.selectByExample(example);
    }

    @Override
    public List<Orders> ORDERS_LIST() {
        return ordersDao.ORDERS_LIST();
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return ordersDao.deleteByPrimaryKey(id);
    }

    @Override
    public Orders findOrdersById(String id) {
        return ordersDao.findOrdersById(id);
    }
}
