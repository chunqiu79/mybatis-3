package com.chunqiu79.manual;

import com.chunqiu79.manual.io.Resources;

import java.io.InputStream;

/**
 * @author: chunqiu79
 * @time: 2024/8/2 9:02
 * @desc:
 */
public class ManualTest {

    public static void main(String[] args) {
        InputStream stream = Resources.getResourceAsStream("mybatis-config");
    }

}
