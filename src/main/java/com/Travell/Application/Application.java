package com.Travell.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.Travell")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
