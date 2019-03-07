package com.zhu.springbootle.controller;

import com.sun.javaws.exceptions.ExitException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExpceptionHandler {
    //没有自适应效果
  /*  @ResponseBody
    @ExceptionHandler(ExitException.class)
    public Map<String,Object> handleException(Exception e){
        Map<String,Object> map=new HashMap<>();
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        return map;
    }*/
    @ExceptionHandler(ExitException.class)
    public String handleException(Exception e, HttpServletRequest resquest){
        Map<String,Object> map=new HashMap<>();
        resquest.setAttribute("java.servlet.error.status_code",500);
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        return "forward:/error";
    }
}
