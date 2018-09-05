package com.designw.model;
/*
* 用户登录
* */
public class Users {
    private Integer userId;
    private Integer userPwd;
    private Integer userType;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(Integer userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userPwd=" + userPwd +
                ", userType=" + userType +
                '}';
    }
}
