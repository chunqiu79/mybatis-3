package com.chunqiu79.example;

import com.chunqiu79.example.table.entity.User;
import com.chunqiu79.example.table.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: chunqiu79
 * @time: 2024/7/30 10:46
 * @desc:
 */
public class Example002Cache {
  public static void main(String[] args) throws IOException {
    useCache();
  }

  private static void useCache() throws IOException {
    InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    User user = mapper.selectByPrimaryKey(1L);
    System.out.println("user:" + user);

    User user2 = mapper.selectByPrimaryKey(1L);
    System.out.println("user2:" + user2);
  }

  private static void noUseCache() throws IOException {
    InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    User user = mapper.selectByPrimaryKey(1L);
    System.out.println("user:" + user);

    // 2次查询中间添加修改逻辑   这里会清空缓存
    user.setAmount(user.getAmount());
    mapper.updateByPrimaryKey(user);

    User user2 = mapper.selectByPrimaryKey(1L);
    System.out.println("user2:" + user2);
  }

}
