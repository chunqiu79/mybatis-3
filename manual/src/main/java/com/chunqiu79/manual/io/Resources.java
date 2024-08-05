package com.chunqiu79.manual.io;

import java.io.InputStream;

/**
 * @author: chunqiu79
 * @time: 2024/8/2 8:53
 * @desc:
 */
public class Resources {

    public static InputStream getResourceAsStream(String resource) {
        return Resources.class.getClassLoader().getResourceAsStream(resource);
    }

}
