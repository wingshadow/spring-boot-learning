package com.hawk.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: AdminApplication
 * @ProjectName spring-boot-learning
 * @Author Hawk
 * @Date 2021/2/1 15:06
 */
@SpringBootApplication(scanBasePackages = {"com.hawk"})
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
