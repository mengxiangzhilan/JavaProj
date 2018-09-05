package com.designw.model;

public class Graduation {
    private Integer studentId;
    private Integer teacherId;
    private Integer gradId;
    private String gradName;

    public String getGradName() {
        return gradName;
    }

    public void setGradName(String gradName) {
        this.gradName = gradName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getGradId() {
        return gradId;
    }

    public void setGradId(Integer gradId) {
        this.gradId = gradId;
    }

    @Override
    public String toString() {
        return "Graduation{" +
                "studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", gradId=" + gradId +
                ", gradName='" + gradName + '\'' +
                '}';
    }
}
