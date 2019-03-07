package com.zhu.springbootle.controller;

import com.zhu.springbootle.dao.DepartmentDao;
import com.zhu.springbootle.dao.EmployeeDao;
import com.zhu.springbootle.entities.Department;
import com.zhu.springbootle.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;
    //查询所有员工返回列表页面
    @GetMapping("/emps")
    public String list(Model model){
      Collection<Employee> employees= employeeDao.getAll();
      model.addAttribute("emps",employees);
        return "emp/list";
    }
//来到添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //来到添加页面查出所有部门在页面显示
        Collection<Department> departments= departmentDao.getDepartments();
        model.addAttribute("depts",departments);
    return "emp/add";
    }
    //员工添加
    //springmvc自动将请求参数和入参对象的属性进行一一绑定，要求请求参数的名字和javabean入参对象的属性名是一样的
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //来到修改页面,
   @RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
    public String toEditPage(@PathVariable("id")Integer id,Model model){
        Employee employee =employeeDao.get(id);
        model.addAttribute("emp",employee);
        Collection<Department> departments= departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }
    //员工修改，需要提交员工id;
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }
    //员工删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
