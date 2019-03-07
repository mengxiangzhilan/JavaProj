package com.zhu.springbootle.config;

import com.zhu.springbootle.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*@Configuration指明当前类是一个配置类，就是来替代之前的spring配置文件
在配置文件用<bean></bean>添加组件
* */
@Configuration
public class MyAppConfig {
    @Bean //给容器添加组件
    public HelloService HelloService(){
    System.out.println("配置类@bean给容器添加组件了");
    return new HelloService();
    }
}
