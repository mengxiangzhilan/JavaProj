package com.zhu.springbootle.controller;

import com.zhu.springbootle.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
//@RestController//直接返回给浏览器  相当于@Controller+@ResponseBody
public class helloController {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("user")String user)
    {if(user.equals("aaa")){
        throw new UserNotExistException();
    }
        return "hello wood";
    }
//查数据展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
       map.put("hello","<h1>你好</h1>");
        map.put("users",Arrays.asList("2","3","4"));
        return "success";
    }

}
