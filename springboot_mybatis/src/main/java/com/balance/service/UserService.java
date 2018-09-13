package com.balance.service;

import com.balance.mapper.UserMapper;
import com.balance.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liukai on 2018/9/13.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> queryList(){
        return userMapper.queryList();
    }
    public void save(User user){
        userMapper.save(user);
    }
    public void batchDelete(Integer[]ids){
        userMapper.batchDelete(ids);
    }
    public void update(User user){
        userMapper.update(user);
    }
}
