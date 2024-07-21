package com.koifish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.koifish.mapper")
public class KoifishBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(KoifishBlogApplication.class, args);
    }
}