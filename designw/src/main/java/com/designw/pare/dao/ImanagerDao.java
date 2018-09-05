package com.designw.pare.dao;


import com.designw.model.*;
import org.springframework.stereotype.Repository;
import java.util.List;
/*
* 管理操作DAO
* */
@Repository
public interface ImanagerDao {
    /*
    对users表操作
     */
    public List<Users> selectUsers ();//查询所有用户信息
    public void deleteUsers(Users users);//删除用户
    public void insertUsers(Users users);//添加用户
    public void updateUsers(Users users);//修改密码
    /*
    对管理员表操作
     */
    public List<Manager> selectManager ();//查询管理员信息
    public Manager getManager (Manager manager);//根据id查询用户信息
    public void insertManager(Manager manager);//添加管理员
    public void deleteManager(Manager manager);//删除管理员
    /*
    对学院表进行操作
     */
    public void insertCollege(College college);//添加学院
    public void deleteCollege(College college);//删除学院
    public List<College> selectCollege();//查询学院
    public void updateCollege(College college);//修改学院
     public College getCollege(College college);
    /*
    对学生表操作
     */
    public List<Student> selectStudent();//查询教师信息
    public void insertStudent(Student student);//添加学生信息
    public void deleteStudent(Student id);//删除学生信息
    public Student getStudentNews(Student id);//查询学生信息
    public void updateStudent (Student student);
    /*
    对教师表操作
     */
    public void insertTeacher(Teacher teacher);//添加教师信息
    public void deleteTeacher(Teacher teacher);//删除教师信息
    public List<Teacher> selectTeacher();//查询教师信息
    public Teacher getTeacherNews(Teacher teacher);//查询详细信息
    public void updateTeacher (Teacher teacher);
    /*
    对毕业表操作
     */
    public List<GraduationNew> selectGraduation();//查询毕业生信息及成绩
    public GraduationNew getGraduationNews(int id);
}
