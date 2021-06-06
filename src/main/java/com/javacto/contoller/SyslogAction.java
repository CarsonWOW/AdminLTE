package com.javacto.contoller;

import com.javacto.po.Syslog;
import com.javacto.service.SyslogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 日志控制层
 */
@Controller
@RequestMapping("Syslog")
public class SyslogAction {
    @Resource
    private SyslogService syslogService;

    @RequestMapping("SyslogList")
    public String SyslogList(Model model){
        List<Syslog> syslogList=syslogService.selectByExample(null);
        model.addAttribute("syslogList",syslogList);
        return "syslog-list";
    }
}
