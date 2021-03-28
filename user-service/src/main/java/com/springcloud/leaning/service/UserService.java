package com.springcloud.leaning.service;

import com.springcloud.leaning.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User queryById(Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }

}
