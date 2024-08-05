package com.chunqiu79.manual.session;

import java.sql.Connection;

/**
 * @author: chunqiu79
 * @time: 2024/8/2 9:14
 * @desc:
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration configuration;

    private Connection connection;

    public SqlSession openSession() {
        return new DefaultSqlSession(configuration, connection);
    }
}
