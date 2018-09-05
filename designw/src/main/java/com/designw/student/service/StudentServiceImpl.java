package com.designw.student.service;

import com.designw.model.Graduation;
import com.designw.model.GraduationStudnt;
import com.designw.model.GraduationTeacher;
import com.designw.model.Student;
import com.designw.pare.dao.ImanagerDao;
import com.designw.student.dao.IstudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements Istudentservice {
    @Autowired
    private ImanagerDao imanagerDao;
    @Autowired
    private IstudentDao istudentDao;
    public GraduationStudnt selectsandg(Student student){

        return istudentDao.selectsandg(student);
    }
    public List<GraduationTeacher> selecttegr(int collegid){
       List<GraduationTeacher>  list=istudentDao.selecttegr(collegid);
        return list;
    }
    public Graduation getGraduation (Integer studentid){
        return istudentDao.getGraduation(studentid);
    }
    public void updateGraduation(Graduation graduation){
        istudentDao.updateGraduation(graduation);
    }
}
