package com.entity;

import org.junit.jupiter.api.Test;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSession;
import com.dao.EmployeeDao;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.time.LocalDate;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.Arrays;

public class EmployeeTest {
    @Test
    public void testSelectByCondition() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Employee employee = new Employee();
        employee.setDept("人事部");
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        List<Employee> employee2 = employeeDao.selectByCondition(employee);
        System.out.println(employee2);
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition2() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setName("王浩");
        employee.setDept("人事部");
        List<Employee> e = employeeDao.selectByCondition2(employee);
        System.out.println(e);
        sqlSession.close();
    }
    
    @Test
    public void testSelectByCondition3() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setName("王浩");
        employee.setDept("人事部");
        List<Employee> e = employeeDao.selectByCondition3(employee);
        System.out.println(e);
        sqlSession.close();
    }
    
    @Test
    public void testUpdateByCondition() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setId(4);
        employee.setName("刘佳");
        int result = employeeDao.updateByCondition(employee);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }
    
    @Test
    public void testBatchDelete() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(51);
        ids.add(52);
        ids.add(53);
        int result = employeeDao.batchDelete(ids);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }
    
    @Test
    public void testBatchAdd() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "张三", "女", 20, "开发部", "工程师", 10000.00, LocalDate.of(2020, 1, 1), "12345678901", "zhangsan@gmail.com"));
        employees.add(new Employee(2, "李四", "女", 21, "开发部", "工程师", 10000.00, LocalDate.of(2020, 1, 1), "12345678902", "lisi@gmail.com"));
        employees.add(new Employee(3, "王五", "男", 22, "开发部", "工程师", 10000.00, LocalDate.of(2020, 1, 1), "12345678903", "wangwu@gmail.com"));
        int result = employeeDao.batchAdd(employees);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition4() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setName("李萌");
        employee.setDept("研发部");
        List<Employee> e = employeeDao.selectByCondition4(employee);
        System.out.println(e);
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition5() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setName("'王浩'");
        employee.setDept("1 or 1=1");
        List<Employee> e = employeeDao.selectByCondition5(employee);
        System.out.println(e);
        sqlSession.close();
    }


    @Test
    public void testSelectByCondition6() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setName("浩");
        List<Employee> e = employeeDao.selectByCondition6(employee);
        System.out.println(e);
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition7() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        List<Employee> e = employeeDao.selectByCondition7(20, 25);
        System.out.println(e);
        sqlSession.close();
    }

    @Test
    public void testSelectPage() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        PageHelper.startPage(8, 5);
        List<Employee> e = employeeDao.selectPage();
        PageInfo<Employee> pageInfo = new PageInfo<>(e);
        System.out.println("总条数:"+pageInfo.getTotal());
        System.out.println("当前页的数据:"+pageInfo.getList());
        System.out.println("总页码:"+pageInfo.getPages());
        System.out.println("页码序列:"+ Arrays.toString(pageInfo.getNavigatepageNums()));
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition8() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        List<Employee> employees = employeeDao.selectByCondition8("emp_name");
        System.out.println(employees);
        sqlSession.close();
    }
}