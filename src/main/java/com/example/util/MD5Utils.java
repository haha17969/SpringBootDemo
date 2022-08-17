package com.example.util;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.util.*;

import java.security.MessageDigest;
import java.util.UUID;


public class MD5Utils {
    public static String getMD5Password(String password) {
       String str="dswef[ewr}";
        byte[] data = (password + str).getBytes();
        Base64 base64 = new Base64();
        String encode = base64.encodeAsString(data);
       return  encode;
    }

    public static void main(String[] args) {
        MD5Utils.getMD5Password("haha");
    }

}

