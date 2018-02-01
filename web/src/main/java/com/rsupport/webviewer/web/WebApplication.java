package com.rsupport.webviewer.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.rsupport.webviewer.core.repository"})
@EntityScan(basePackages = {"com.rsupport.webviewer.core.domain"})
@ComponentScan(basePackages = {"com.rsupport.webviewer.web", "com.rsupport.webviewer.core"})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
