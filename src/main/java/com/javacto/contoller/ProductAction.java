package com.javacto.contoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javacto.po.Product;
import com.javacto.service.ProductService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@RequestMapping("product")
@Controller
public class ProductAction {
    @Resource
    private ProductService productService;
    //查询商品
    @RequestMapping("queryAllPageList")
    public String queryAllPageList(Model model,Integer PageNow,Integer PageSize){
        //如果传过来的当前页,和每页显示多少条为空时,设置
        if (PageNow==null){
            PageNow=1;
        }
        if (PageSize==null){
            PageSize=2;
        }
        PageHelper.startPage(PageNow,PageSize);
        List<Product> productList=productService.selectByExample(null);
        PageInfo<Product> pageInfo=new PageInfo<Product>(productList);
        model.addAttribute("ProductList",pageInfo.getList());
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("PageSize",PageSize);
        return "product-list";
    }
    //添加商品
    @RequestMapping("AddProduct")
    public String AddProduct(Product product){
        //使用UUID
        String id= UUID.randomUUID().toString().replaceAll("-","");
        product.setId(id);
        productService.insert(product);
        return "redirect:/rest/product/queryAllPageList";
    }
    //删除商品
    @RequestMapping("deleteProduct")
    public String deleteProduct(String sbq){
        productService.deleteByPrimaryKey(sbq);
        return "redirect:/rest/product/queryAllPageList";
    }
    //根据id查询
    @RequestMapping("findProductById")
    public String findProductById(Model model,String id){
        Product product=productService.selectByPrimaryKey(id);
        model.addAttribute("product",product);
        return "product-update";
    }
    //修改
    @RequestMapping("updateProduct")
    public String updateProduct(Product product){
        productService.updateByPrimaryKeySelective(product);
        return "redirect:/rest/product/queryAllPageList";
    }
}
