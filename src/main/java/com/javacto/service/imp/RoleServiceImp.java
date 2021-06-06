package com.javacto.service.imp;

import com.javacto.mapper.RoleDao;
import com.javacto.po.Permission;
import com.javacto.po.Role;
import com.javacto.po.RoleExample;
import com.javacto.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RoleServiceImp implements RoleService {
    @Resource
    private RoleDao roleDao;
    @Override
    public List<Role> selectByExample(RoleExample example) {
        return roleDao.selectByExample(example);
    }

    @Override
    public List<Role> ROLES() {
        return roleDao.ROLES();
    }

    @Override
    public Role findRoleAndPermission(String id) {
        return roleDao.findRoleAndPermission(id);
    }

    @Override
    public int addRole(Role role) {
        return roleDao.addRole(role);
    }

    @Override
    public int deleteRole(String id) {
        return roleDao.deleteRole(id);
    }

    @Override
    public List<Permission> findOtherPermission(String roleId) {
        return roleDao.findOtherPermission(roleId);
    }

    @Override
    public void insertRole_Permission(String[] permissionId, String roleId) {
        //可用添加多个权限资源,所以定义一个permissionId集合,每次遍历都执行添加方法
        for (String permissionIds:permissionId){
            roleDao.insertRole_Permission(permissionIds,roleId);
        }
    }
}
