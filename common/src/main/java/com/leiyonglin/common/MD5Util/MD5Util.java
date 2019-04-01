package com.leiyonglin.common.MD5Util;


import org.springframework.util.DigestUtils;

public class MD5Util {

    static public String convertMd5String(String password, String key){

        String encodeStr = DigestUtils.md5DigestAsHex((password + key).getBytes());

        return encodeStr;
    }
}
