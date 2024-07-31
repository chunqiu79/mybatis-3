package com.chunqiu79.example;

import com.chunqiu79.example.table.entity.User;
import com.chunqiu79.example.table.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: chunqiu79
 * @time: 2024/7/30 10:46
 * @desc:
 */
public class Example001 {
  public static void main(String[] args) throws IOException {
    selectList();
  }

  private static void selectOne() throws IOException {
    InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    User user = mapper.selectByPrimaryKey(1L);
    System.out.println("user:" + user);
  }

  private static void selectList() throws IOException {
    InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    List<User> userList = mapper.selectAll();
    System.out.println("userList:" + userList.toString());
  }



}
