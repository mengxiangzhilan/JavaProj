package com.zhu.springbootgao.service;

import com.zhu.springbootgao.bean.Employee;
import com.zhu.springbootgao.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    /*
    * 将方法的运行结果进行缓存，以后在要相同的数据直接从缓存中去
    * cachemanager管理多个cache组建的，对缓存的真正crud操作在cache组件中，每一个缓存有自己唯一的名字
    * 几个属性：cacheNames/value:指定缓存组件的名字
    * key:缓存数据使用的key：可以用它来指定默认是使用方法参数的值  1-方法返回值
    * 编写spel：#id；参数的值 #a0 #p0 #root.orgs[0]
    * keygenerator:key的生存器，可以使用自己指定key的生成器的组件id'
    * cacheManger:指定缓存管理器： 或者指定缓存解析器
    * condition：指定符合条件的情况下才缓存
    * unless：否定缓存
    * sync:是否使用异步
    *
    * 原理
    * 1、自动配置类 CacheAutoConfiguration
    * 2、缓存配置类
    *org.springframework.boot.autoconfigure.cache.xxxCacheConfiguration
    * 3哪个配置类生效
    * 4、给容器中注册一个CacheManager，ConcurrentMapCacheManger
    * 5、可以获取和创建ConcurrentMapCache类型的缓存组件；作用：将数据保存在ConcurrentMap中
    *运行流程
    * 1方法运行前查询chache(缓存组件),第一次如果没有自己创建
    * 2去chache中查找缓存中的内容，使用一个key，默认是方法的参数
    * key是按某种策略生产的
    * 3没有查询到缓存就调用目标方法
    * 4将目标方法的返回结果放进缓存中
    * */
    @Cacheable(value = {"emp"})
    public Employee getEmp(Integer id){
        System.out.println("查询员工"+id);
        Employee emplbyid=employeeMapper.getEmpById(id);
        return emplbyid;
    }
    @CachePut(value = "emp",key ="#result.id" )
    public Employee update(Employee employee){
        employeeMapper.updateEmp(employee);
        return employee;
    }
    //清除缓存
    //allEntries = true 清除所有缓存
    //beforeInvocation=false默认在方法执行或执行
    @CacheEvict(value = "emp",key = "#id"/*,allEntries = false*/)
    public void deleteEmp(Integer id){
        System.out.println("delete"+id);
    }
}
