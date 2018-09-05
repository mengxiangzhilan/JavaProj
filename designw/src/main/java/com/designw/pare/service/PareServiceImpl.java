package com.designw.pare.service;


import com.designw.model.*;
import com.designw.pare.dao.ImanagerDao;
import com.designw.pare.dao.IuserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class PareServiceImpl implements Ipareservice {
    @Autowired
    private ImanagerDao imanagerDao;
    @Autowired
    private IuserDao iuserDao;

   //整体添加用户
    public void addUsersN(Map<String,Allusers> map) {
       Integer id= map.get("allusers").getAlluserid();
        Integer pwd= map.get("allusers").getUsers().getUserPwd();
        Integer type=  map.get("allusers").getUsers().getUserType();
        this.addUsers(id,pwd,type);
        if(type==0){
            String name= map.get("allusers").getAlluserNmae();
            this.addManager(id,name);
        }else if(type==1){
            String name= map.get("allusers").getAlluserNmae();

            Integer coid=map.get("allusers").getStudent().getCollegeIiD();
            Integer phone=map.get("allusers").getTeacher().getTeacherPhone();
            this.addTeahcer(id,name,phone,coid);
        }else if(type==2){
            String class1=map.get("allusers").getStudent().getClass1();
            Integer coid=map.get("allusers").getStudent().getCollegeIiD();
            String name= map.get("allusers").getAlluserNmae();
            this.addStudent(id,name,class1,coid);

        }
    }


    //}
    //整体删除
    public void deleteUserN(int id,int type){
        this.deleteUsers(id);
        if(type==0){
            this.deleteManager(id);
        }else if (type==2){
            this.delectStudent(id);
        }else if (type==1){
            this.deleteTeacher(id);
        }
    }
    //登录操作
    public Users uSelectUsers(Integer id,Integer pwd) {
        Users user=new Users();
        user.setUserId(id);
        user.setUserPwd(pwd);
       Users users = iuserDao.selectUsersData(user);
        return users;
    }
    //添加用户
    public void addUsers(int id, int pwd,int type){
        Users users=new Users();
        users.setUserId(id);
        users.setUserPwd(pwd);
        users.setUserType(type);
        imanagerDao.insertUsers(users);
    }
    //修改密码
    public void updateUsers(int id,int pwd){
        Users users=new Users();
        users.setUserId(id);
        users.setUserPwd(pwd);
        imanagerDao.updateUsers(users);
    }
    //查询用户
    public List<Users> mSelectUsers() {
        List<Users> list = null;
        list = imanagerDao.selectUsers();
        return list;
    }
    //删除用户
    public void deleteUsers(int id){
        Users users=new Users();
        users.setUserId(id);
        imanagerDao.deleteUsers(users);
    }

    //添加学院
    public void addCollege(College college){

        imanagerDao.insertCollege(college);
    }
    //删除学院
    public void deleteCollege(int id){
        College college=new College();
        college.setCollegeerId(id);
        imanagerDao.deleteCollege(college);
    }
    //查询学院
    public List<College> selectCollege(){
        List<College> list = null;
        list=imanagerDao.selectCollege();
        return list;
    }
    public void updateCollege(College college){
        imanagerDao.updateCollege(college);
    }
    public College getCollege(int id){
        College college=new College();
        college.setCollegeerId(id);
        return imanagerDao.getCollege(college);
    }
    //添加管理员
    public void addManager(int id,String name){
        Manager manager=new Manager();
        manager.setManagerId(id);
        manager.setManagerName(name);
        imanagerDao.insertManager(manager);
    }
    //删除管理员信息
    public void deleteManager(int id){
        Manager manager=new Manager();
        manager.setManagerId(id);
        imanagerDao.deleteManager(manager);
    }
    //查询管理员
    public List<Manager> selectManager(){
        List<Manager> list = null;
        list=imanagerDao.selectManager();
        return list;
    }

    public Manager getManager(int id){
        Manager manager=new Manager();
        manager.setManagerId(id);
        return imanagerDao.getManager(manager);
    }

    //添加学生
    public void addStudent(int id,String name,String class1,int collageId ){

        Student student=new Student();
        student.setStudentId(id);
       student.setCollegeIiD(collageId);
        student.setClass1(class1);
        student.setStudentName(name);
        imanagerDao.insertStudent(student);
    }
    //查询学生
    public List<Student> selectStudent(){
        List<Student> list = null;
     list=imanagerDao.selectStudent();
     return list;
    }
    //查询详细学生
    public Student getStudentNews(int id){
        Student student=new Student();
        student.setStudentId(id);
       Student s1=imanagerDao.getStudentNews(student);
        return s1;
    }
    //删除学生
    public void delectStudent(int id){
        Student student=new Student();
        student.setStudentId(id);
        imanagerDao.deleteStudent(student);
    }
    public void updateStudent (Student student){
        imanagerDao.updateStudent(student);
    }
    //添加教师
    public void addTeahcer(int id,String name,int phone,int collegeId){
        Teacher teacher=new Teacher();
        teacher.setTeacherId(id);
       teacher.setCollegeIiD(collegeId);
        teacher.setTeacherName(name);
        teacher.setTeacherPhone(phone);
        imanagerDao.insertTeacher(teacher);
    }
    //查询教师
    public List<Teacher> selectTeacher(){
        List<Teacher> list = null;
        list=imanagerDao.selectTeacher();
        return list;
    }
    //删除教师
    public void deleteTeacher(int id){
        Teacher teacher=new Teacher();
        teacher.setTeacherId(id);
        imanagerDao.deleteTeacher(teacher);
    }
    //查询详细教师信息
    public Teacher getTeacherNews(int id){
        Teacher teacher=new Teacher();
        teacher.setTeacherId(id);
        return imanagerDao.getTeacherNews(teacher);
    }
    public void updateTeacher (Teacher teacher){

        imanagerDao.updateTeacher(teacher);
    }
    //查询毕业生表信息
    public List<GraduationNew> selectGraduation(){
        List<GraduationNew> list = null;
        list=imanagerDao.selectGraduation();
        return list;
    }
    public GraduationNew getGraduationNews(int id){
        return imanagerDao.getGraduationNews(id);
    }

}
