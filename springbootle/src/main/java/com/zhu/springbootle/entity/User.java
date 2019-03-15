package com.zhu.springbootle.entity;

import javax.persistence.*;

//配置映射关系
@Entity//告诉jpa这是一个实体类（和数据表映射的类）
@Table(name="tbl_user")//指定和哪个数据表对应,默认你为表名
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自怎主键
    private Integer id;
    @Column(name="last_name",length =50)
    private String lastName;
    @Column//省略默认列名就是实体名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
