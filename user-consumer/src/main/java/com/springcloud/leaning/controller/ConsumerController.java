package com.springcloud.leaning.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.springcloud.leaning.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id) {
        String url = "http://localhost:9091/user/" + id;
        // 获取eureka中注册的user-service实例列表
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance = serviceInstanceList.get(0);
        url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/" + id;
        System.out.println(url);
        return restTemplate.getForObject(url, User.class);
    }

    @GetMapping("/balanced/{id}")
    public User balancedQueryById(@PathVariable Long id) {
        String url = "http://user-service/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }

    @GetMapping("/hystrix/{id}")
    @HystrixCommand(fallbackMethod = "queryByIdFallback")
    public User hystrixQueryById(@PathVariable Long id) {
        String url = "http://user-service/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }

    public User queryByIdFallback(Long id) {
        System.out.printf("查询用户信息失败。id：%s", id);
        return new User();
    }

}
