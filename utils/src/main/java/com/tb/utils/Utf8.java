package com.tb.utils;

import java.io.UnsupportedEncodingException;

/**
 * 解决get传值乱码问题
 * @author 何龙
 * @create 2019-01-08 13:50
 */
public class Utf8 {
    public static String getString(String filePath) {
        try {
            return new String(filePath.getBytes("ISO-8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
}
