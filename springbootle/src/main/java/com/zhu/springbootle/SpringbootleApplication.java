package com.zhu.springbootle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

//@ImportResource  导入Spring的配置文件，让配置文件生效/springboot没有spring的配置文件，我们自己编写的配置文件也不能自动识别
//@ImportResource(locations={classpath:beans.xml})  //标记在主配置类上
//springboot推荐给容器中添加组建的方式
//配置类=====spring配置文件   具体看myappconfih类
@SpringBootApplication
public class SpringbootleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootleApplication.class, args);
    }

    //自己的视图解析器
    @Bean
    public ViewResolver myViewReover(){
        return new MyViewResolver() ;
    }
    private static class MyViewResolver implements ViewResolver {

        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}
