package com.acompe.Mapper;

import com.acompe.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class UserMapperTest {
    @Test
    public void findAllTest() {

    }

    @Test
    public void findById() throws IOException {
        String resource = "MyBatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findById(1L));
        sqlSession.close();
        in.close();
    }

    @Test
    public void insert() throws IOException {
        String resource = "MyBatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUserName("ceshi");
        user.setPassWord("ceshi");
        user.setName("ceshi");
        userMapper.add(user);
        System.out.println(user);
        sqlSession.close();
        in.close();
    }

    @Test
    public void deleteById() throws IOException {
        String resource = "MyBatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteById(12L);
        sqlSession.close();
        in.close();
    }

    @Test
    public void update() throws IOException {
        String resource = "MyBatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        try(SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.findById(11L);
            user.setName("aaa");
            user.setUserName("aaa");
            user.setPassWord("aaa");
            userMapper.update(user);
        }
        in.close();
    }
}
