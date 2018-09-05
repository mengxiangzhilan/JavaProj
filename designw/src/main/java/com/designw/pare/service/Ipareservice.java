package com.designw.pare.service;


import com.designw.model.*;

import java.nio.channels.Pipe;
import java.util.List;
import java.util.Map;

public interface Ipareservice {
    public void addUsersN(Map<String,Allusers> map);
    public Users uSelectUsers(Integer id,Integer pwd);//登录查询
    public void addUsers(int id, int pwd,int type);
    public void updateUsers(int id,int pwd);
    public List<Users> mSelectUsers();
    public void deleteUsers(int id);
    public void addCollege(College college);
    public void deleteCollege(int id);
    public void updateCollege(College college);
    public College getCollege(int college);
    public List<College> selectCollege();
    public void addManager(int id,String name);
    public void deleteManager(int id);
    public List<Manager> selectManager();
    public Manager getManager(int id);
    public void addStudent(int id,String name,String class1,int collageId );
    public List<Student> selectStudent();
    public Student getStudentNews(int id);
    public void delectStudent(int id);
    public void addTeahcer(int id,String name,int phone,int collageId);
    public List<Teacher> selectTeacher();
    public void deleteTeacher(int id);
    public void updateTeacher (Teacher teacher);
    public void updateStudent (Student student);
    public Teacher getTeacherNews(int id);
    public List<GraduationNew> selectGraduation();
    public void deleteUserN(int id,int type);//整体删除
    public GraduationNew getGraduationNews(int id);
}
