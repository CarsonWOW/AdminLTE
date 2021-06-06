package com.javacto.contoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javacto.po.Permission;
import com.javacto.po.Role;
import com.javacto.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("Role")
public class RoleAction {
    @Resource
    private RoleService roleService;
    //查询角色
    @RequestMapping("queryRole")
    public String queryRole(Model model, Integer PageNow, Integer PageSize){
        if (PageNow==null){
            PageNow=1;
        }
        if (PageSize==null){
            PageSize=4;
        }
        PageHelper.startPage(PageNow,PageSize);
        List<Role> RoleList=roleService.selectByExample(null);
        PageInfo<Role> pageInfo=new PageInfo<Role>(RoleList);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("Roles",pageInfo.getList());
        model.addAttribute("PageSize",PageSize);
        return "role-list";
    }
    //查询角色详情
    @RequestMapping("RoleShow")
    public String RoleShow(String RoleId,Model model){
        Role roles=roleService.findRoleAndPermission(RoleId);
        model.addAttribute("roles",roles);
        return "role-show";
    }
    //新增角色
    @RequestMapping("AddRole")
    public String Addrole(Role role){
        //使用UUID, 自动生成一个随机id
        String id= UUID.randomUUID().toString().replaceAll("-","");
        role.setId(id);
        roleService.addRole(role);
        return "redirect:/rest/Role/queryRole";
    }
    //删除角色,并关联删除对应的权限信息
    @RequestMapping("DeleteRole")
    public String DeleteARole(String RoleId,Model model){
        roleService.deleteRole(RoleId);
        return "redirect:/rest/Role/queryRole";
    }
    //角色添加权限,先根据roleId查询出可用添加的权限信息
    @RequestMapping("FindOtherPermission")
    public String FindOtherPermission(String RoleId,Model model){
        List<Permission> permissions =roleService.findOtherPermission(RoleId);
        model.addAttribute("permissions",permissions);
        model.addAttribute("RoleId",RoleId);
        return "role-permission-add";
    }
    //给角色添加权限
    @RequestMapping("addPermissionToRole")
    public String addPermissionToRole(String roleId,String[] permissionIds){
        roleService.insertRole_Permission(permissionIds,roleId);
        return "redirect:/rest/Role/queryRole";
    }

}
