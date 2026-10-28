package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDao {
    public List<Employee> selectByCondition(Employee employee);
    public List<Employee> selectByCondition2(Employee employee);
    public List<Employee> selectByCondition3(Employee employee);   
    public int updateByCondition(Employee employee);
    public int batchDelete(List<Integer> ids);
    public int batchAdd(List<Employee> emps);
}
