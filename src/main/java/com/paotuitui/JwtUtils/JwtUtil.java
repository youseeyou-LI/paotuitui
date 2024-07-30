package com.paotuitui.JwtUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtil {
    private static final String SECRET_KEY = "3q2+7wBZr3sNniWC6+7Q9g==..."; // 密钥，实际使用时应更复杂且安全
    private static final long EXPIRATION_TIME = 86400000; // 有效期，这里设置为1天（单位毫秒）

    /**
     * 生成JWT
     * @param studentId 用户ID
     * @return 生成的JWT字符串
     */
    public static String generateToken(Long studentId) {
        return Jwts.builder()
                .setSubject(String.valueOf(studentId)) // 将用户ID设置为主题
                .setIssuedAt(new Date()) // 设置签发时间
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) // 设置过期时间
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY) // 设置签名算法和密钥
                .compact();
    }

    /**
     * 解析JWT
     * @param token JWT字符串
     * @return Claims对象，包含JWT的主体信息
     */
    public static Claims parseToken(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY) // 设置解析时使用的密钥
                .parseClaimsJws(token) // 解析JWT字符串
                .getBody(); // 获取Claims对象
    }

    /**
     * 从JWT中获取用户ID
     *
     * @param token JWT字符串
     * @return 用户ID
     */
    public static Integer getUserIdFromToken(String token) {
        Claims claims = parseToken(token);
        return Integer.getInteger(claims.getSubject());
        //return claims.getSubject().toString();
    }
}
