package com.designw.student.dao;

import com.designw.model.Graduation;
import com.designw.model.GraduationStudnt;
import com.designw.model.GraduationTeacher;
import com.designw.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IstudentDao {
    public GraduationStudnt selectsandg(Student student);//查询学生情况
    public List<GraduationTeacher> selecttegr(int collegid);
    public Graduation getGraduation (int studentid);
    public void updateGraduation(Graduation graduation);
}
