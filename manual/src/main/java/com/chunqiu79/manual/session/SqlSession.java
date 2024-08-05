package com.chunqiu79.manual.session;

/**
 * @author: chunqiu79
 * @time: 2024/8/2 9:11
 * @desc:
 */
public interface SqlSession {

    <T> T selectOne(String statement);

    void close();

}
