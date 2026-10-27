package com.entity;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import java.io.Reader;
import java.util.List;
import com.dao.UserDao;

public class UsersTest {
    @Test
    public void test() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Users users = userDao.get_id(1);
        System.out.println(users);
    }

    @Test
    public void test2() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<Users> users = userDao.get_all();
        System.out.println(users);
    }

    @Test
    public void test3() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Users users = new Users();
        users.setName("Tom");
        users.setAge(12);
        userDao.add(users);
        sqlSession.commit();
        System.out.println("添加成功");
    }

    @Test
    public void test4() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.delete(2);
        sqlSession.commit();
        System.out.println("删除成功");
    }

    @Test
    public void test5() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Users users = new Users();
        users.setId(11);
        users.setName("Bob");
        users.setAge(12);
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.update(users);
        sqlSession.commit();
        System.out.println("修改成功");
    }
}   