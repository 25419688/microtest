package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CongeApplication {
    public static void main (String[] args){
       SpringApplication.run(CongeApplication.class, args);

    }
}
