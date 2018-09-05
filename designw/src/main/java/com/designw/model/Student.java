package com.designw.model;

public class Student {
    private Integer studentId;
    private String studentName;
    private String class1;
    private Integer collegeIiD ;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public Integer getCollegeIiD() {
        return collegeIiD;
    }

    public void setCollegeIiD(Integer collegeIiD) {
        this.collegeIiD = collegeIiD;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", class1='" + class1 + '\'' +
                ", collegeIiD=" + collegeIiD +
                '}';
    }
}
