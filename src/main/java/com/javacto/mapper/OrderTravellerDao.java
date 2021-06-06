package com.javacto.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.javacto.po.OrderTravellerExample;
import com.javacto.po.OrderTravellerKey;

@Repository
public interface OrderTravellerDao {
    long countByExample(OrderTravellerExample example);

    int deleteByExample(OrderTravellerExample example);

    int deleteByPrimaryKey(OrderTravellerKey key);

    int insert(OrderTravellerKey record);

    int insertSelective(OrderTravellerKey record);

    List<OrderTravellerKey> selectByExample(OrderTravellerExample example);

    int updateByExampleSelective(@Param("record") OrderTravellerKey record, @Param("example") OrderTravellerExample example);

    int updateByExample(@Param("record") OrderTravellerKey record, @Param("example") OrderTravellerExample example);
}