package com.zhu.springbootgao.controller;

import com.zhu.springbootgao.bean.Employee;
import com.zhu.springbootgao.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmoloyeeController {
@Autowired
    EmployeeService employeeService;
@GetMapping("/emp/{id}")
public Employee getTmployee(@PathVariable("id")Integer id)
{
    Employee employee=employeeService.getEmp(id);
    return employee;
}
}

