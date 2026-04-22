package org.example.rhizome_networkbackend.utils;

import java.security.MessageDigest;

/**
 * MD5加密工具类（仅用于用户密码加密）
 */
public class MD5Util {
    // 固定盐值（毕设够用，可自定义）
    private static final String SALT = "rhizome_network";

    /**
     * 加盐加密密码（对外暴露的方法）
     */
    public static String encryptWithSalt(String password) {
        if (password == null || password.trim().isEmpty()) {
            return "";
        }
        // 密码 + 盐 拼接后加密
        return encrypt(password + SALT);
    }

    /**
     * 基础MD5加密（私有方法，内部调用）
     */
    private static String encrypt(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    sb.append("0"); // 补0保证32位
                }
                sb.append(hex);
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("MD5加密失败", e);
        }
    }
}