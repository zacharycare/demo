package com.nageu.base.util;

import java.security.MessageDigest;

public class MD5 {
    public static String getMD5(String string)
    {
        if(string==null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(string.getBytes("UTF-8"));
            for(byte b : md.digest()){
                sb.append(String.format("%02X", b)); // 10进制转16进制，X 表示以十六进制形式输出，02 表示不足两位前面补0输出
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getMD5("1"));
    }
}
