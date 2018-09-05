package com.designw.model;

import java.util.List;

public class GraduationTeacher {
    private Teacher teacher;
    private List<Graduation> graduationList;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Graduation> getGraduationList() {
        return graduationList;
    }

    public void setGraduationList(List<Graduation> graduationList) {
        this.graduationList = graduationList;
    }

    @Override
    public String toString() {
        return "GraduationTeacher{" +
                "teacher=" + teacher +
                ", graduationList=" + graduationList +
                '}';
    }
}
