package com.javacto.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.javacto.po.Permission;
import com.javacto.po.PermissionExample;
import org.springframework.stereotype.Service;

@Repository
public interface PermissionDao {
    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
    //根据角色id查询出权限资源信息
    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{id} )")
    public List<Permission> findPermissionByRoleId(String id);

    //查询所有资源信息
    @Select("SELECT * FROM permission")
    List<Permission> PERMISSIONS();
    //删除权限
    @Delete("DELETE FROM permission WHERE id=${id}")
    int DeletePermission(String id);

    //根据id查询权限信息
    @Select("SELECT * FROM permission WHERE id=#{id}")
    Permission findPermissionById(String id);
    //添加权限管理
    @Insert("INSERT INTO permission (id,permissionName,url)VALUES(#{id},#{permissionname},#{url})")
    void AddPermission(Permission permission);
}