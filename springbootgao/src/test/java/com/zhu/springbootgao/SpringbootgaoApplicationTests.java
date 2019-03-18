package com.zhu.springbootgao;

import com.zhu.springbootgao.bean.Employee;
import com.zhu.springbootgao.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootgaoApplicationTests {
    @Autowired
    EmployeeMapper E;
    @Test
    public void contextLoads() {
        Employee e=E.getEmpById(1);
        System.out.println(e);

    }

}
