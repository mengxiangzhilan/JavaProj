package com.zhu.springbootgao.mapper;

import com.zhu.springbootgao.bean.Employee;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapper {
    @Select("SELECT * FROM EMPLOYEE WHERE ID=#{id}")
    public Employee getEmpById(Integer id);
    @Select("insert into employee(lastName,email,gender,d_id)values(#{lastName},#{email},#{gender},#{dId})")
    public void insertEmp(Employee employee);
    @Select("UPDATE EMPLOYESS SET LASTNAME=#{lastName},EMAIL=#{email},gender=#{gender},d_id=#{dId} where ID=#{id}")
    public void updateEmp(Employee employee);
    @Select("delete from employee where id=#{id}")
    public void deleteRmpById(Integer id);

}
