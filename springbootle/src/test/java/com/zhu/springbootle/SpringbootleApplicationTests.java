package com.zhu.springbootle;

import com.zhu.springbootle.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
//可以在测试期间自动注入
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootleApplicationTests {
    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;
   Logger logger=  LoggerFactory.getLogger(getClass());//日志记录器
    @Test
    public void contextLoads() {
      //  System.out.println(person);
        //日志级别由低到高，可以调节输出的日志级别，日志就只会在这个级别或者更高级别生效
        //默认info
        logger.trace("trace日志");
       logger.debug("debug日志");
       logger.info("info日志");
       logger.warn("warn日志");
       logger.error("error日志");
    }
    @Test
    public void testHelloService() {

        boolean b=ioc.containsBean("HelloService");
        System.out.println(b);
    }

}
