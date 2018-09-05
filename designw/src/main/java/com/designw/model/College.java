package com.designw.model;
/*
* 学院
* */
public class College {

    private Integer collegeerId;
    private String collegeerName;

    public Integer getCollegeerId() {
        return collegeerId;
    }

    public void setCollegeerId(Integer collegeerId) {
        this.collegeerId = collegeerId;
    }

    public String getCollegeerName() {
        return collegeerName;
    }

    public void setCollegeerName(String collegeerName) {
        this.collegeerName = collegeerName;
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeerId=" + collegeerId +
                ", collegeerName='" + collegeerName + '\'' +
                '}';
    }
}
