package com.zhu.springbootle.config;
import com.zhu.springbootle.component.LoginHandlerInterceptor;
import com.zhu.springbootle.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.util.List;

@Configuration
//自己配置webmvc
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        registry.addViewController("/zhuzhuxia").setViewName("success");
    }

/**
 * xxxConfigurer能扩展配置
 * xxxCustomizerb定制配置
 * */


    //让所有WebMvcConfigurer起作用
    @Bean //将组件注册在容器中
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer adapter=new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");//用于重定向
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //springboot做好了静态资源映射，不用烂
                /*registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/","/user/login");*/
            }
        };
       return  adapter;

    }
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
}

}
