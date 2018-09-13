package com.balance.controller;

import com.balance.common.Result;
import com.balance.model.User;
import com.balance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by liukai on 2018/9/13.
 */
@Controller
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    @Qualifier("student")
    private Map<String,String> getMap;
    @RequestMapping("/query")
    public Result queryList(){
       String name= getMap.get("name");
        System.out.println(name);
       List list= userService.queryList();
       Result result=new Result(list);
       return result;
    }
    @RequestMapping("/save")
    public Result save(User user){
        userService.save(user);
        return new Result();
    }
}
