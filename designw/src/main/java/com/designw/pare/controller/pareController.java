package com.designw.pare.controller;


import com.designw.model.*;
import com.designw.pare.service.Ipareservice;
import com.designw.student.service.Istudentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@Scope(value="prototype")
@RequestMapping("/page")
public class pareController {

    @Autowired
    private Istudentservice studentServiceImpl;
    @Autowired
    private Ipareservice pareServiceImpl;
    @RequestMapping(value = "/index")
    public String index(){

        return "denlu";
    }

    @RequestMapping(value = "/yonghudelu",method = RequestMethod.POST)
    public ModelAndView yonghudelu(@RequestParam(value = "userId" ) String id,
                                   @RequestParam(value = "userPwd")String pwd,
                                   HttpSession session){
        Integer idq=Integer.valueOf(id);
        Integer pwdq=Integer.valueOf(pwd);
        Users user=pareServiceImpl.uSelectUsers(idq,pwdq);
        ModelAndView mv=new ModelAndView();
        if(user!=null){
            if (user.getUserType()==0){
                Manager manager=pareServiceImpl.getManager(idq);
                session.setAttribute("manager", manager);
                List<GraduationNew> glist=pareServiceImpl.selectGraduation();
                mv.addObject("glist",glist);
                mv.setViewName("zhuye");

            }else if(user.getUserType()==2){
                Student student=pareServiceImpl.getStudentNews(idq);
               GraduationStudnt graduationStudnt= studentServiceImpl.selectsandg(student);
                session.setAttribute("graduationStudnt",graduationStudnt);
                mv.addObject("graduationStudnt",graduationStudnt);
                //转发到main请求
                mv.setViewName("szhuye");
            }
        }else {
            //登录失败，设置失败信息，并调转到登录页面
            mv.addObject("message","登录名和密码错误，请重新输入");
            mv.setViewName("error");
        }
        return mv;
    }

}
