package com.ll.k8study.domain.home.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * packageName    : com.ll.k8s.domain.home.controller
 * fileName       : HomeController
 * author         : sungjun
 * date           : 2025-01-17
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        kyd54       최초 생성
 */
@Controller
public class HomeController {
    @Value("${custom.jwt.secretKey}")
    private String jwtSecretKey;
    @GetMapping("/")
    @ResponseBody
    public String showMain() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        // getHostName 메소드를 호출하여 호스트 이름을 얻습니다.
        String hostname = localHost.getHostName();
        return "test, hostname : " + hostname;
    }
    @GetMapping("/jwtSecretKey")
    @ResponseBody
    public String showJwtSecretKey() {
        return jwtSecretKey;
    }
}
