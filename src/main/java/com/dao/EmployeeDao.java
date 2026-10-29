package com.dao;

import java.util.List;  

import org.apache.ibatis.annotations.Param;

import com.entity.Employee;

public interface EmployeeDao {
    public List<Employee> selectByCondition(Employee employee);
    public List<Employee> selectByCondition2(Employee employee);
    public List<Employee> selectByCondition3(Employee employee);   
    public int updateByCondition(Employee employee);
    public int batchDelete(List<Integer> ids);
    public int batchAdd(List<Employee> emps);
    public List<Employee> selectByCondition4(Employee employee);
    public List<Employee> selectByCondition5(Employee employee);
    public List<Employee> selectByCondition6(Employee employee); 
    public List<Employee> selectByCondition7(@Param("minAge") int minAge, @Param("maxAge") int maxAge);
    public List<Employee> selectPage();
    public List<Employee> selectByCondition8(String name);
    public Employee selectById(int id);
}
