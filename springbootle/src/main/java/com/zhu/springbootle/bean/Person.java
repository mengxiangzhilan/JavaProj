package com.zhu.springbootle.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

//@ConfigurationProperties将配置文件每一个属性的值，映射到这个组件中
//prefix = "person" ，配置文件中哪个下面的属性进行--映射
//只有这个组件是荣建，才能使用
@Component
//@PropertySource(value = {"classpath:person.properties"})  //加载指定的配置文件
//@ImportResource  导入Spring的配置文件，让配置文件生效/springboot没有spring的配置文件，我们自己编写的配置文件也不能自动识别
//@ConfigurationProperties(prefix = "person")  //默认从全局文件获取值
//@Validated  数据校验
public class Person {
    /**
     * <bean class="Person">  相当于@Component
     *     <property name="LostName" value="字面量/${key}从环境变量和配置文件中获取值/#{}
     *     </property>
     *
     *     </bean>
     *
     * */
    //@Email   name必须是邮箱格式
    @Value("${person.last-name}")//不支持复杂数据注入
    private String name;
    @Value("#{11*2}")
private Integer age;
    @Value("true")
private Boolean boos;
private Date birth;
private Map<String,Object>maps;
private List<Object> lists;
private dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boos=" + boos +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoos() {
        return boos;
    }

    public void setBoos(Boolean boos) {
        this.boos = boos;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public com.zhu.springbootle.bean.dog getDog() {
        return dog;
    }

    public void setDog(com.zhu.springbootle.bean.dog dog) {
        this.dog = dog;
    }
}
