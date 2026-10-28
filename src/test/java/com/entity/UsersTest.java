package com.entity;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import java.io.Reader;
import java.util.List;
import com.dao.UsersDao;

public class UsersTest {
    @Test
    public void test() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UsersDao usersDao = sqlSession.getMapper(UsersDao.class);
        Users users = usersDao.get_id(1);
        System.out.println(users);
    }

    @Test
    public void test2() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UsersDao usersDao = sqlSession.getMapper(UsersDao.class);
        List<Users> users = usersDao.get_all();
        System.out.println(users);
    }

    @Test
    public void test3() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UsersDao usersDao = sqlSession.getMapper(UsersDao.class);
        Users users = new Users();
        users.setName("Tom");
        users.setAge(12);
        usersDao.add(users);
        sqlSession.commit();
        System.out.println("添加成功");
    }

    @Test
    public void test4() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UsersDao usersDao = sqlSession.getMapper(UsersDao.class);
        usersDao.delete(2);
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
        UsersDao usersDao = sqlSession.getMapper(UsersDao.class);
        usersDao.update(users);
        sqlSession.commit();
        System.out.println("修改成功");
    }
}   