package com.example.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

@Data
@SpringBootApplication
public class WebappApplication  {

    @Autowired
    private CustomProperties properties;

    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
        
    }


}