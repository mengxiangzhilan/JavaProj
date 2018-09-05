package com.designw.student.service;

import com.designw.model.Graduation;
import com.designw.model.GraduationStudnt;
import com.designw.model.GraduationTeacher;
import com.designw.model.Student;

import java.util.List;

public interface Istudentservice {
    public GraduationStudnt selectsandg(Student student);
    public List<GraduationTeacher> selecttegr(int collegid);
    public Graduation getGraduation (Integer studentid);
    public void updateGraduation(Graduation graduation);
}
