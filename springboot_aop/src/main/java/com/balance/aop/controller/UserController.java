package com.balance.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liukai on 2018/9/12.
 */
@RestController
public class UserController {
    @RequestMapping("/first")
    public String first(){
        System.out.println("我是方法first（）");
        return "first controller";
    }
    @RequestMapping("/second")
    public String second(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "second controller";
    }
    @RequestMapping("/doError")
    public int error(){
        return 1/0;
    }
}
