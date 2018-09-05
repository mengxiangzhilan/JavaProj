package com.designw.model;

import java.util.List;

public class GraduationStudnt {
   private Student student;
   private Graduation graduation;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Graduation getGraduation() {
        return graduation;
    }

    public void setGraduation(Graduation graduation) {
        this.graduation = graduation;
    }

    @Override
    public String toString() {
        return "GraduationStudnt{" +
                "student=" + student +
                ", graduation=" + graduation +
                '}';
    }
}
