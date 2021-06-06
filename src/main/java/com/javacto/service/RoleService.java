package com.javacto.service;

import com.javacto.po.Permission;
import com.javacto.po.Role;
import com.javacto.po.RoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleService {
    List<Role> selectByExample(RoleExample example);
    //#根据用户Id查询出用户信息及用户角色信息
    List<Role> ROLES();
    Role findRoleAndPermission(String id);
    int addRole(Role role);
    int deleteRole(String id);
    List<Permission> findOtherPermission(String roleId);
    void insertRole_Permission (String[] permissionId, String roleId);
}
