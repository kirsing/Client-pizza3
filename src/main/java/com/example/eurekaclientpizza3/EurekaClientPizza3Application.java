package com.example.eurekaclientpizza3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientPizza3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientPizza3Application.class, args);
    }

}
