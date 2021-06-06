package com.javacto.contoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javacto.po.Permission;
import com.javacto.service.PermissionService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("permission")
public class PermissionAction {
    @Resource
    private PermissionService permissionService;
    //查询权限
    @RequestMapping("queryPermission")
    public String queryPermission(Model model, Integer PageNow,Integer PageSize){
        if (PageNow==null){
            PageNow=1;
        }
        if (PageSize==null){
            PageSize=4;
        }
        PageHelper.startPage(PageNow,PageSize);
        List<Permission> permissions=permissionService.PERMISSIONS();
        PageInfo<Permission> pageInfo=new PageInfo<Permission>(permissions);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("permissions",pageInfo.getList());
        model.addAttribute("PageSize",PageSize);
        return "permission-list";
    }
    //删除权限管理路径
    @RequestMapping("DeletePermission")
    public String DeletePermission(String id){
        permissionService.DeletePermission(id);
        return "redirect:/rest/permission/queryPermission";
    }
    //新建权限管理
    @RequestMapping("AddPermission")
    public String AddPermission(Permission permission,Model model){
        String id= UUID.randomUUID().toString().replaceAll("-","");
        permission.setId(id);
        permissionService.AddPermission(permission);
        return "redirect:/rest/permission/queryPermission";
    }
    //权限详情,根据id查询
    @RequestMapping("findPermissionById")
    public String findPermissionById(String id,Model model){
        Permission permission=permissionService.findPermissionById(id);
        model.addAttribute("permission",permission);
        return "permission-show";
    }
}
