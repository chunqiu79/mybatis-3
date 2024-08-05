package com.chunqiu79.manual.session;

import java.io.InputStream;

/**
 * @author: chunqiu79
 * @time: 2024/8/2 8:50
 * @desc:
 */
public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(InputStream inputStream) {
        return new DefaultSqlSessionFactory();
    }

}
