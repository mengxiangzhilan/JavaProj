package com.designw.pare.controller;

import com.designw.model.*;
import com.designw.pare.service.Ipareservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/page")
public class managerController {
    @Autowired
    private Ipareservice pareServiceImpl;
    //跳转主页
    @RequestMapping( value = "/zhuye", method = RequestMethod.GET)
    public ModelAndView zhuye(){
        ModelAndView modelAndView=new ModelAndView();
        List<GraduationNew> glist=pareServiceImpl.selectGraduation();
        modelAndView.addObject("glist",glist);
        modelAndView.setViewName("zhuye");
        return modelAndView;
    }
    //显示学院信息
    @RequestMapping( value = "/collegenews",method = RequestMethod.GET)
    public ModelAndView collegenews(){
        ModelAndView modelAndView=new ModelAndView();
        List<College> collegeList=pareServiceImpl.selectCollege();
        modelAndView.addObject("collegeList",collegeList);
        modelAndView.setViewName("collegeNews");
        return modelAndView;
    }
   /* //重定向到学院
    @RequestMapping( value = "/Ccollegenews",method = RequestMethod.GET)
    public String Ccollegenews(){
        return "redirect:/page/collegenews";
    }*/
    //跳转添加学院页面
    @RequestMapping( value = "/addcollege",method = RequestMethod.GET)
    public String addcollege( Map<String,Object> map){
       map.put("college",new College());
        return "addcollege";
    }
    //添加学院
    @RequestMapping( value = "/addcollegenews", method = RequestMethod.POST)
   public String addcollegenews(@RequestParam(value = "collegeerId") Integer id,
                                @RequestParam(value = "collegeerName") String name){
        College college=new College();
        college.setCollegeerId(id);
        college.setCollegeerName(name);
        pareServiceImpl.addCollege(college);
        return "redirect:/page/collegenews";
}
   //修改学院
   @RequestMapping( value = "/updatecollegenews/{collegeerId}", method = RequestMethod.GET)
   public String updateecollege(@PathVariable("collegeerId") Integer collegeerId,Map<String,Object> map){
       College college=pareServiceImpl.getCollege(collegeerId);
       map.put("college",college);
       return "addcollege";
   }
    @ModelAttribute
    public void getCollege(@RequestParam(value ="collegeerId",required = false)Integer collegeerId, Map<String,Object>map){
        if (collegeerId!=null){
            map.put("college",pareServiceImpl.getCollege(collegeerId));
        }
    }
    @RequestMapping( value = "/addcollegenews", method = RequestMethod.PUT)
     public String updcollege(@ModelAttribute(value = "college") College college){
         pareServiceImpl.updateCollege(college);
         return "redirect:/page/collegenews";
     }
   //删除学院
    @RequestMapping( value = "/deletecollegenews/{collegeerId}", method = RequestMethod.DELETE)
    public String deletecollege(@PathVariable("collegeerId") Integer collegeerId){
        pareServiceImpl.deleteCollege(collegeerId);
        return "redirect:/page/collegenews";
    }
    //显示管理员页面
    @RequestMapping( value = "/managerNews", method = RequestMethod.GET)
    public ModelAndView managerNews(){
        ModelAndView modelAndView=new ModelAndView();
        List<Manager> managerList=pareServiceImpl.selectManager();
        modelAndView.addObject("managerList",managerList);
        modelAndView.setViewName("managerNews");
        return modelAndView;
    }
    //显示教师页面
    @RequestMapping( value = "/teacherNews", method = RequestMethod.GET)
    public ModelAndView teacherNews(){
        ModelAndView modelAndView=new ModelAndView();
        List<Teacher>teacherList=pareServiceImpl.selectTeacher();
        modelAndView.addObject("teacherList",teacherList);
        modelAndView.setViewName("teacherNews");
        return modelAndView;
    }
    //修改教师信息
    @RequestMapping( value = "/updateteachernews/{teacherId}", method = RequestMethod.GET)
    public String updateteacher(@PathVariable("teacherId") Integer teacherId,Map<String,Object> map){
        Teacher teacher=pareServiceImpl.getTeacherNews(teacherId);
        map.put("teacher",teacher);
        return "updteacherNews";
    }
    @ModelAttribute
    public void getTeacher(@RequestParam(value ="teacherId",required = false)Integer teacherId, Map<String,Object>map){
        if (teacherId!=null){
            map.put("teacher",pareServiceImpl.getTeacherNews(teacherId));
        }
    }
    @RequestMapping( value = "/updteacherNews", method = RequestMethod.PUT)
    public String updteacher(@ModelAttribute(value = "teacherId") Teacher teacher){
        pareServiceImpl.updateTeacher(teacher);
        return "redirect:/page/teacherNews";
    }
    //显示学生信息
    @RequestMapping( value = "/studentNews", method = RequestMethod.GET)
    public ModelAndView studentNews(){
        ModelAndView modelAndView=new ModelAndView();
        List<Student>studentList=pareServiceImpl.selectStudent();
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("studentNews");
        return modelAndView;
    }
    //修改学生
    @RequestMapping( value = "/updateStudentnews/{studentId}", method = RequestMethod.GET)
    public String updatestudent(@PathVariable("studentId") Integer studentId,Map<String,Object> map){
        Student student=pareServiceImpl.getStudentNews(studentId);
        map.put("student",student);
        return "updstudentNews";
    }
    @ModelAttribute
    public void getStudent(@RequestParam(value ="studentId",required = false)Integer studentId, Map<String,Object>map){
        if (studentId!=null){
            map.put("student",pareServiceImpl.getStudentNews(studentId));
        }
    }
    @RequestMapping( value = "/updstudentNews", method = RequestMethod.PUT)
    public String updstudent(@ModelAttribute(value = "studentId") Student student){
        pareServiceImpl.updateStudent(student);
        return "redirect:/page/studentNews";
    }
    //显示用户
    @RequestMapping( value = "/selectuser", method = RequestMethod.GET)
    public ModelAndView selectuser(){
        ModelAndView modelAndView=new ModelAndView();
        List<Users>usersList=pareServiceImpl.mSelectUsers();
        modelAndView.addObject("usersList",usersList);
        modelAndView.setViewName("UsersNews");
        return modelAndView;
    }
    //删除用户

    @RequestMapping( value = "/deleteUsers/{userId}/{userType}", method = RequestMethod.DELETE)
    public String deletusers(@PathVariable("userId") Integer userId,@PathVariable("userType") Integer userType){
        pareServiceImpl.deleteUserN(userId,userType);
        return "redirect:/page/selectuser";
    }
    //添加用户
    @RequestMapping( value = "/adduser", method = RequestMethod.GET)
    public String adduser(Map<String,Object>map){
        List<College> collegeList=pareServiceImpl.selectCollege();
    map.put("collegeList",collegeList);
    return "addusers";
    }
    //添加用户操作
    @RequestMapping(value = "/adduserNews",method = RequestMethod.POST)
    public String adduserNews(Allusers allusers){
        System.out.println(allusers.getStudent().getCollegeIiD());
        Map<String,Allusers> map=new HashMap<>();
        map.put("allusers",allusers);
        pareServiceImpl.addUsersN(map);
        return "redirect:/page/selectuser";
    }
}
