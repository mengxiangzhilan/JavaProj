package com.designw.student.controller;

import com.designw.model.*;
import com.designw.pare.service.Ipareservice;
import com.designw.student.service.Istudentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/page")
public class studentController {
    @Autowired
    private Istudentservice studentServiceImpl;
    @Autowired
    private Ipareservice pareServiceImpl;
    //首页
    //选题管理
    @RequestMapping(value = "/xuankeguanli" ,method = RequestMethod.GET)
    public String xuankeguanli(HttpSession session,Map<String,Object> map) {
        GraduationStudnt graduationStudnt = (GraduationStudnt) session.getAttribute("graduationStudnt");
           Student student= graduationStudnt.getStudent();
        GraduationStudnt graduationStudnt1= studentServiceImpl.selectsandg(student);
            map.put("graduationStudnt1",graduationStudnt1);
        int collegeid=graduationStudnt.getStudent().getCollegeIiD();
            List<GraduationTeacher> graduationTeacherList = studentServiceImpl.selecttegr(collegeid);
            map.put("graduationTeacherList", graduationTeacherList);
            return "sxuabtiguanl";
            }
        //学生选题
    @RequestMapping(value = "addxuankeguanli",method = RequestMethod.POST)
    public String addxuankeguanli(Graduation graduation){
        System.out.println(graduation);
        if (graduation!=null){
            studentServiceImpl.updateGraduation(graduation);
        }
        return "redirect:/page/xuankeguanli";
    }
    @RequestMapping(value = "biyeshejichengji",method = RequestMethod.GET)
    public String selbishe(HttpSession session ,Map<String,Object>map){
        GraduationStudnt graduationStudnt = (GraduationStudnt) session.getAttribute("graduationStudnt");
        Integer studentid= graduationStudnt.getStudent().getStudentId();
        GraduationNew graduationNew=pareServiceImpl.getGraduationNews(studentid);
        map.put("graduationNews",graduationNew);
        return "bishecheji";
    }


}

