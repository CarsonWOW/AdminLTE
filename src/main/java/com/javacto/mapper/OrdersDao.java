package com.javacto.mapper;

import java.util.List;

import com.javacto.po.Member;
import com.javacto.po.Product;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;
import com.javacto.po.Orders;
import com.javacto.po.OrdersExample;

@Repository
public interface OrdersDao {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(String id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    /**
     * 查询订单,并关联产品信息
     * @return
     */
    @Select("SELECT * FROM orders")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "ordernum",column = "orderNum"),
            @Result(property = "ordertime",column = "orderTime"),
            @Result(property = "peoplecount",column = "peopleCount"),
            @Result(property = "orderdesc",column = "orderDesc"),
            @Result(property = "paytype",column = "payType"),
            @Result(property = "orderstatus",column = "orderStatus"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One
                    (select = "com.javacto.mapper.ProductDao.selectByPrimaryKey"))
    })
    List<Orders> ORDERS_LIST();
    /**
     * 根据id查询出订单及产品,及游客,会员的信息
     */
    @Select("SELECT * FROM orders WHERE id=#{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "ordernum",column = "orderNum"),
            @Result(property = "ordertime",column = "orderTime"),
            @Result(property = "peoplecount",column = "peopleCount"),
            @Result(property = "orderdesc",column = "orderDesc"),
            @Result(property = "paytype",column = "payType"),
            @Result(property = "orderstatus",column = "orderStatus"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One
                    (select = "com.javacto.mapper.ProductDao.selectByPrimaryKey")),
            @Result(property = "member",column = "memberId",javaType = Member.class,one=@One (select =
            "com.javacto.mapper.MemberDao.selectByPrimaryKey")),
            @Result(property = "travellers",column = "id",many = @Many(select = "com.javacto.mapper.TravellerDao.TRAVELLERS",fetchType = FetchType.LAZY))
    })
    public Orders findOrdersById(String id);
}