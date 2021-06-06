package com.javacto.service.imp;

import com.javacto.mapper.PermissionDao;
import com.javacto.po.Permission;
import com.javacto.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PermissionServiceImp implements PermissionService {
    @Resource
    private PermissionDao permissionDao;
    @Override
    public List<Permission> PERMISSIONS() {
        return permissionDao.PERMISSIONS();
    }

    @Override
    public int DeletePermission(String id) {
        return permissionDao.DeletePermission(id);
    }

    @Override
    public Permission findPermissionById(String id) {
        return permissionDao.findPermissionById(id);
    }

    @Override
    public void AddPermission(Permission permission) {
        permissionDao.AddPermission(permission);
    }
}
