package com.springcloud.leaning.service;

import com.springcloud.leaning.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserClientFallback implements UserClient {

    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setId(id);
        user.setUserName("异常用户");
        return user;
    }

}
