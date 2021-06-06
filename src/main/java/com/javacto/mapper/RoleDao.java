package com.javacto.mapper;

import java.util.List;

import com.javacto.po.Permission;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import com.javacto.po.Role;
import com.javacto.po.RoleExample;

@Repository
public interface RoleDao {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    //#根据用户Id查询出用户信息及用户角色信息
    @Select("SELECT * FROM role WHERE id IN(SELECT roleId FROM users_role WHERE userId=#{userId})")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "rolename",column = "roleName"),
            @Result(property = "roledesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",many = @Many(select = ("com.javacto.mapper.PermissionDao.findPermissionByRoleId"))),

    })
    List<Role> ROLES();
    //根据角色id查询权限信息及角色信息
    @Select("SELECT * FROM role WHERE id=#{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "rolename",column = "roleName"),
            @Result(property = "roledesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",many = @Many(select = ("com.javacto.mapper.PermissionDao.findPermissionByRoleId"))),

    })

    Role findRoleAndPermission(String id);

    //新增角色
    @Insert("insert into role(id,roleName,roleDesc) values(#{id},#{rolename},#{roledesc})")
    int addRole(Role role);

    //删除角色,并关联删除掉对应的权限记录
    @Delete("DELETE FROM role WHERE id=#{id}")
    int deleteRole(String id);
    //添加权限先查询出可用的权限信息
    @Select("SELECT * FROM permission WHERE id NOT IN(SELECT permissionId FROM role_permission WHERE roleId=#{roleId})")
    List<Permission> findOtherPermission(String roleId);
    //添加权限,查询出来的权限信息,选择后,保存权限信息permissionid以及roleId

    @Insert("INSERT INTO role_permission (permissionId,roleId)VALUES(#{permissionId},#{roleId})")
    void  insertRole_Permission(@Param("permissionId") String permissionId,@Param("roleId") String roleId);
}