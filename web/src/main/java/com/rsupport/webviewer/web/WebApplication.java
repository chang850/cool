package com.rsupport.webviewer.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Module 분리시 EntityScan 이 정상적으로 이루어지지 않고 이씀.......
@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
@EnableJpaRepositories(basePackages = {"com.rsupport.webviewer.core.repository"})
@EntityScan(basePackages = {"com.rsupport.webviewer.core.domain"})
@ComponentScan(basePackages = {"com.rsupport.webviewer.web", "com.rsupport.webviewer.core"})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
