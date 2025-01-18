package com.ll.k8study.global;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * packageName    : com.ll.k8s.global
 * fileName       : AppConfig
 * author         : sungjun
 * date           : 2025-01-17
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        kyd54       최초 생성
 */
@Configuration
@RequiredArgsConstructor
public class AppConfig {
    private static String activeProfile;
    @Value("${spring.profiles.active}")
    public void setActiveProfile(String activeProfile) {
        this.activeProfile = activeProfile;
    }
    public static boolean isProd() {
        return activeProfile.equals("prod");
    }
    public static boolean isDev() {
        return activeProfile.equals("dev");
    }
    public static boolean isTest() {
        return activeProfile.equals("Test");
    }
    public static boolean isNotProd() {
        return !isProd();
    }
    @Getter
    private static String jwtSecretKey;
    @Value("${custom.jwt.secretKey}")
    public void setJwtSecretKey(String jwtSecretKey) {
        this.jwtSecretKey = jwtSecretKey;
    }
}
