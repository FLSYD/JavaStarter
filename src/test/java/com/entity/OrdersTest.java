package com.entity;

import org.junit.jupiter.api.Test;

import com.dao.OrdersDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.Reader;
import java.util.List;

public class OrdersTest {

    @Test
    public void testGetByNo() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();   
        OrdersDao ordersDao = sqlSession.getMapper(OrdersDao.class);
        Orders orders = ordersDao.getByNo("aaaa");
        System.out.println(orders);
        sqlSession.close();
    }
    @Test
    public void testGetAll() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersDao ordersDao = sqlSession.getMapper(OrdersDao.class);
        List<Orders> orders = ordersDao.getAll();
        System.out.println(orders);
        sqlSession.close();
    }
}
