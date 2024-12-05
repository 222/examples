package com.example.retryspringbootexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class RetrySpringbootExampleApplication implements CommandLineRunner {

    @Resource
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(RetrySpringbootExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        demoService.performTask(true);
//        demoService.performTask(false);
    }
}
