package com.javacto.mapper;

import java.util.List;

import com.javacto.po.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;
import com.javacto.po.Users;
import com.javacto.po.UsersExample;

@Repository
public interface UsersDao {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(String id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    //根据id查询用户信息及角色信息
    @Select("SELECT * FROM users WHERE id=#{id}")
    @Results({
            //主键
            @Result(id = true,column = "id",property = "id"),
            @Result(property = "email",column = "email"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "phonenum",column = "phoneNum"),
            @Result(property = "status",column = "STATUS"),
            @Result(property = "roles",column = "id",many = @Many(select = "com.javacto.mapper.RoleDao.ROLES",fetchType = FetchType.EAGER))
    })
   public Users findUsersById(String id);
   public Users QueryUserAndRole(String id);

    //根据用户id查询出可以添加的用户权限
    @Select("SELECT * FROM role WHERE id NOT IN (SELECT roleId FROM users_role WHERE userId=#{userId})")
    List<Role> OtherROLE_LIST(String userId);
    //添加权限,要使用注解,因为是2个参数,并且不是一个po中的属性变量,也不能传对象
    @Insert("insert into users_role(userId,roleId) values(#{userId},#{roleId})")
    public void insertRole(@Param("userId") String userId,@Param("roleId") String roleId);
}