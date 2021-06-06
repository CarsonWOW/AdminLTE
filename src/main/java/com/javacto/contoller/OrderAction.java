package com.javacto.contoller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javacto.po.Orders;
import com.javacto.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderAction {
    @Resource
    private OrderService orderService;
    //查询所有订单,并分页
    @RequestMapping("queryOrders")
    public String queryOrders(Model model,Integer PageNow,Integer PageSize){
        if (PageNow==null){
            PageNow=1;
        }
        if (PageSize==null){
            PageSize=2;
        }
        PageHelper.startPage(PageNow,PageSize);
        List<Orders> orders=orderService.ORDERS_LIST();
        PageInfo<Orders> pageInfo=new PageInfo<Orders>(orders);
        model.addAttribute("Orders",pageInfo.getList());
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("PageSize",PageSize);
        return "orders-list";
    }
    //删除订单
    @RequestMapping("deleteOrders")
    public String deleteOrders(String id,Model model){
        orderService.deleteByPrimaryKey(id);
        return "redirect:/rest/order/queryOrders";
    }
    //订单详情
    @RequestMapping("OrderDetil")
    public String OrderDetil(String id,Model model){
        Orders orders=orderService.findOrdersById(id);
        model.addAttribute("orders",orders);
        return "orders-show";
    }
}
