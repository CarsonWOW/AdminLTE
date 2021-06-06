package com.javacto.service.imp;

import com.javacto.mapper.UsersDao;
import com.javacto.po.Role;
import com.javacto.po.Users;
import com.javacto.po.UsersExample;
import com.javacto.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Resource
    private UsersDao usersDao;
    @Override
    public List<Users> selectByExample(UsersExample example) {
        return usersDao.selectByExample(example);
    }

    @Override
    public int insert(Users record) {
        return usersDao.insert(record);
    }

    @Override
    public Users findUsersById(String id) {
        return usersDao.findUsersById(id);
    }

    @Override
    public Users QueryUserAndRole(String id) {
        return usersDao.QueryUserAndRole(id);
    }

    @Override
    public List<Role> OtherROLE_LIST(String userId) {
        return usersDao.OtherROLE_LIST(userId);
    }

    @Override
    public void insertRole(String userId, String[] roleIds) {
        for (String roleId:roleIds){
            usersDao.insertRole(userId,roleId);
        }
    }


}
