package com.zhu.springbootgao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan(value="com.zhu.springbootgao.mapper")//mapper下所有包自动添加apper注解
@SpringBootApplication
@EnableCaching//开启注解缓存
public class SpringbootgaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootgaoApplication.class, args);
    }

}
