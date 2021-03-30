# SpringCloudLeaning
A Learning Project For The SpringCloud
 - 使用RestTemplate发送请求
 - 说出SpringCloud的作用
 - 搭建Euraka注册中心
 - 使用Robbin负载均衡
 - 使用Hystrix熔断
 - 使用Feign进行远程调用
 - 搭建Spring Cloud Gateway网关服务
 - 配置Spring Cloud Gateway路由过滤器
 - 编写Spring Cloud Gateway全局过滤器
 - 搭建Spring Cloud Config配置中心服务
 - 使用Spring Cloud Bus实时更新配置

### sc-hoxton-chapter1

传统项目的接口调用

### sc-hoxton-chapter2

Eureka服务注册中心使用

- ```
  @EnableEurekaServer // 声明应用为eureka服务
  ```

- ```
  @EnableDiscoveryClient // 开启Eureka客户端发现功能
  ```

服务发现动态转发

高可用的Eureka服务

### sc-hoxton-chapter3

ribbon实现负载均衡

```
@LoadBalanced // 在RestTemplate的配置方法上添加 @LoadBalanced 注解，开启负载均衡
```

### sc-hoxton-chapter4

熔断器Hystrix

- ```
  @EnableCircuitBreaker // 开启断路器
  ```

- ```
  @SpringCloudApplication // 当我们的启动类注解越来越多，可以使用该注册替代
  // SpringCloudApplication注解类
  @SpringBootApplication
  @EnableDiscoveryClient
  @EnableCircuitBreaker
  public @interface SpringCloudApplication
  ```

### sc-hoxton-chapter5

使用Feign进行远程调用

- ```
  @EnableFeignClients // 开启feign功能
  ```

  Feign默认集成了ribbon

  Feign默认集成了hystix

