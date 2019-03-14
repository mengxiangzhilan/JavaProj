package com.zhu.springbootle.controller;

import com.zhu.springbootle.exception.UserNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
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
    @Autowired
    JdbcTemplate jdbcTemplate;
    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object>map(){
        List<Map<String,Object>> list=jdbcTemplate.queryForList("select * from department");
   return list.get(0);
    }
}
