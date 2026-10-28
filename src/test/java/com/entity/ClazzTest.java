package com.entity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import java.util.List;
import com.dao.ClazzDao;

import java.io.Reader;

public class ClazzTest {

    @Test
    public void testGetById() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ClazzDao clazzDao = sqlSession.getMapper(ClazzDao.class);
        Clazz clazz = clazzDao.getById(1);
        System.out.println("班级名:"+clazz.getCname()+";对应的老师:"+clazz.getTeacher().getTname());
        sqlSession.close();
    }

    @Test
    public void testGetByIdWithStudents() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ClazzDao clazzDao = sqlSession.getMapper(ClazzDao.class);
        Clazz clazz = clazzDao.getByIdWithStudents(1);
        List<Student> students = clazz.getStudents();
        System.out.println("班级名:"+clazz.getCname()+";对应的老师:"+clazz.getTeacher().getTname()+";对应的学生:");
        for (Student student : students) {
            System.out.println("学号:"+student.getSid()+";姓名:"+student.getSname());
        }
        sqlSession.close();
    }
}
