package com.designw.pare.dao;



import com.designw.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
用户登录操作DAO
 */
@Repository
public interface IuserDao {
    //登录查询
    public Users selectUsersData (Users users);
    //根据id查询信息
    public Users getUsers (Users users);

}
