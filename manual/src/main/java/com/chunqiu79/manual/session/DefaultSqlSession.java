package com.chunqiu79.manual.session;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: chunqiu79
 * @time: 2024/8/2 9:14
 * @desc:
 */
public class DefaultSqlSession implements SqlSession {

    private final Configuration configuration;

    private final Connection connection;

    public DefaultSqlSession(Configuration configuration, Connection connection) {
        this.configuration = configuration;
        this.connection = connection;
    }

    public <T> T selectOne(String statement) {
        return null;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
