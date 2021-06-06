package com.javacto.contoller.SyslogAop;

import com.javacto.contoller.SyslogAction;
import com.javacto.po.Syslog;
import com.javacto.service.SyslogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 切面类,用来完成日志收集
 */
@Component
@Aspect
public class LogAop {
    @Resource
    private SyslogService syslogService;
    @Autowired
    //用于获取url
    private HttpServletRequest httpServletRequest;
    //访问时间
    private Date VisitTime;
    //访问的类
    private Class aClass;
    //方法名
    private String MethodName;
    //前置通知,获取当前时间,执行的类是哪一个,哪一个方法
    @Before("execution(* com.javacto.contoller.*.*(..))")
    public void doBefore(JoinPoint joinPoint){
        VisitTime=new Date();//当前时间就是访问的时间
        aClass=joinPoint.getTarget().getClass();//具体访问的类
        System.out.println(aClass);
        MethodName=joinPoint.getSignature().getName();//访问的方法名

    }
    //后置通知
    @After("execution(* com.javacto.contoller.*.*(..))")
    public void doAfter(JoinPoint joinPoint){
        //获取访问的时长
        long time= (new Date().getTime()-VisitTime.getTime());
        //获取url
        if (aClass!=null && aClass!= LogAop.class && aClass!= SyslogAction.class){
            //获取Url，IP
            String Url= httpServletRequest.getRequestURI();
            String Ip=  httpServletRequest.getRemoteAddr();
            //获取当前操作的用户
            /*SecurityContext context = SecurityContextHolder.getContext();//从上下文中获了当前登录的用户*/
            //将日志相关信息封装到SysLog对象
            Syslog sysLog = new Syslog();
            sysLog.setExecutiontime((int) time); //执行时长  sysLog.setIp(ip);
            sysLog.setMethod("[类名] " + aClass.getName() + "[方法名] " +MethodName);
            sysLog.setUrl(Url);
            sysLog.setIp(Ip);
            //调用Service添加方法完成操作
            syslogService.insertSelective(sysLog);
        }
    }

}
