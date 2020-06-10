package com.zzh.blog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Program: blog
 * @Description: MD5 加密
 * @Author: zouzonghua
 * @Create: 2020-06-10 19:19
 **/
public class Md5Utils {
    /**
     * @Description:  MD5加密
     * @Param: [str] 要加密的字符串
     * @Return: java.lang.String 加密后的字符串
     * @Author: zouzonghua
     * @Date: 2020/6/10 7:22 下午
     */
    public static String code(String str){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[]byteDigest = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < byteDigest.length; offset++) {
                i = byteDigest[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            //32位加密
            return buf.toString();
            // 16位的加密
            //return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }


    public static void main(String[] args) {
        System.out.println(code("123456"));
    }
}
