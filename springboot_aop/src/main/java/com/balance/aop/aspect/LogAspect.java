package com.balance.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志切面
 * Created by liukai on 2018/9/12.
 */
@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(public * com.balance.aop.controller.*.*(..))")
    public void webLog() {
    }
    @Before("webLog()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before 方法执行前");
    }
    @After("webLog()")
    public void after(){
        System.out.println("after 方法执行完毕");
    }
    @Around("webLog()")
    public Object around(ProceedingJoinPoint point){
        System.out.println("around 方法开始执行");
        SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date;
        long timeStart=System.currentTimeMillis();
        date=new Date(timeStart);
        String time=sdf.format(date);
        System.out.println("开始时间"+time);
        try {
            Object o=point.proceed();
            long timeEnd=System.currentTimeMillis();
            date=new Date(timeEnd);
            time=sdf.format(date);
            System.out.println("结束时间："+time);
            System.out.println("方法用时："+(timeEnd-timeStart)/1000+"秒");
            return o;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
