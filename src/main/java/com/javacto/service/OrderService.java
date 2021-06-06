package com.javacto.service;

import com.javacto.po.Orders;
import com.javacto.po.OrdersExample;

import java.util.List;

public interface OrderService {
    List<Orders> selectByExample(OrdersExample example);
    List<Orders> ORDERS_LIST();
    int deleteByPrimaryKey(String id);
    public Orders findOrdersById(String id);
}
