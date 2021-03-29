# SpringCloudLeaning
A Learning Project For The SpringCloud
 - 使用RestTemplate发送请求
 - 说出SpringCloud的作用
 - 搭建Euraka注册中心
 - 使用Robbin负载均衡
 - 使用Hystrix熔断

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