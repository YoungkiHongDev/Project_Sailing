package com.boot.sailing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SailingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SailingApplication.class, args);
        System.out.println("안녕 스프링부트!");
    }

}
