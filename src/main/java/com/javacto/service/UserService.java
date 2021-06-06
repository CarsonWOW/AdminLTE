package com.javacto.service;

import com.javacto.po.Role;
import com.javacto.po.Users;
import com.javacto.po.UsersExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    List<Users> selectByExample(UsersExample example);
    int insert(Users record);
    //根据用户Id查询出所有详细信息
    public Users findUsersById(String id);
    public Users QueryUserAndRole(String id);
    List<Role> OtherROLE_LIST(String userId);
    public void insertRole(String userId, String[] roleIds);
}
