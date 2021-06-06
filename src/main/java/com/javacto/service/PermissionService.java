package com.javacto.service;

import com.javacto.po.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionService {
    List<Permission> PERMISSIONS();
    //删除权限
    int DeletePermission(String id);
    //根据id查询权限信息
    Permission findPermissionById(String id);
    //添加权限管理
    void AddPermission(Permission permission);
}
