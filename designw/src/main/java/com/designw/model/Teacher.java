package com.designw.model;
/*
* j教师
* */
public class Teacher {
    private Integer teacherId;
    private String teacherName;
    private Integer teacherPhone;
    private Integer collegeIiD ;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(Integer teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public Integer getCollegeIiD() {
        return collegeIiD;
    }

    public void setCollegeIiD(Integer collegeIiD) {
        this.collegeIiD = collegeIiD;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherPhone=" + teacherPhone +
                ", collegeIiD=" + collegeIiD +
                '}';
    }
}
