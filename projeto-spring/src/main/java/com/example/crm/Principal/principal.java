package com.example.crm.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.crm.pessoas") 
public class principal {
    public static void main(String[] args) {
        SpringApplication.run(principal.class, args);
    }
}
