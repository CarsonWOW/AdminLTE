package com.javacto.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.javacto.po.Traveller;
import com.javacto.po.TravellerExample;

@Repository
public interface TravellerDao {
    long countByExample(TravellerExample example);

    int deleteByExample(TravellerExample example);

    int deleteByPrimaryKey(String id);

    int insert(Traveller record);

    int insertSelective(Traveller record);

    List<Traveller> selectByExample(TravellerExample example);

    Traveller selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Traveller record, @Param("example") TravellerExample example);

    int updateByExample(@Param("record") Traveller record, @Param("example") TravellerExample example);

    int updateByPrimaryKeySelective(Traveller record);

    int updateByPrimaryKey(Traveller record);
    @Select("SELECT * FROM traveller WHERE id IN(SELECT travellerId FROM order_traveller WHERE orderId=11)")
    List<Traveller> TRAVELLERS();
}