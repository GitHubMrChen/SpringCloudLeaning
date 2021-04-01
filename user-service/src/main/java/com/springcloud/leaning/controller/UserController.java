package com.springcloud.leaning.controller;

import com.springcloud.leaning.pojo.User;
import com.springcloud.leaning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RefreshScope // 开启spring-cloud-bus消息总线刷新配置服务
public class UserController {

    @Autowired
    private UserService userService;
    @Value("${server.port}")
    private String port;
    @Value("${test.name}")
    private String name;

    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id) {
        System.out.println(port);
        System.out.println("配置文件中的test.name=" + name);
        return userService.queryById(id);
    }

}
