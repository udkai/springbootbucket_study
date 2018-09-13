package com.balance.mapper;

import com.balance.model.User;

import java.util.List;

/**
 * Created by liukai on 2018/9/13.
 */
public interface UserMapper {
    List<User>queryList();
    void save(User user);
    void batchDelete(Integer[] ids);
    void update(User user);
}
