package com.javacto.contoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javacto.po.Role;
import com.javacto.po.Users;
import com.javacto.service.UserService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("user")
public class UserAction {
    @Resource
    private UserService userService;
    @RequestMapping("queryAll")
    public String queryAll(Model model,Integer PageNow,Integer PageSize){
        if (PageNow==null){
            PageNow=1;
        }
        if (PageSize==null){
            PageSize=5;
        }
        PageHelper.startPage(PageNow,PageSize);
        List<Users> usersList=userService.selectByExample(null);
        PageInfo<Users> pageInfo=new PageInfo<Users>(usersList);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("Users",pageInfo.getList());
        model.addAttribute("PageSize",PageSize);
       return "user-list";
    }

    //添加用户
    @RequestMapping("UserSave")
    public String UserSave(Model model,Users users){
        //使用UUID
        String id= UUID.randomUUID().toString().replaceAll("-","");
        users.setId(id);
        userService.insert(users);
        return "redirect:/rest/user/queryAll";
    }
    //根据id查询出用户所有关联信息,包括角色信息,访问资源信息
    @RequestMapping("UserDetil")
    public String UserDetil(String id,Model model){
        Users users=userService.QueryUserAndRole(id);
       /* Users users=userService.findUsersById(id);*/
        model.addAttribute("users",users);
        return "user-show";
    }
    //添加角色,先查询可以添加的信息
    @RequestMapping("AddRole")
    public String AddRole(String userId,Model model){
        List<Role> roles=userService.OtherROLE_LIST(userId);
        model.addAttribute("roles",roles);
        model.addAttribute("userId",userId);
        return "user-role-add";
    }
    //添加角色
    @RequestMapping("addRoleByUser")
    public String addRoleByUser(String userId, String[] roleIds){
        //将前端请求过来的2个参数传递给方法中
        userService.insertRole(userId,roleIds);
        return "redirect:/rest/user/queryAll";
    }

}
