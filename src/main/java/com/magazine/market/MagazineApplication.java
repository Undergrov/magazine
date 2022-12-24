package com.magazine.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagazineApplication {

    public static void main(String[] args) {
        SpringApplication.run (MagazineApplication.class, args);
        System.out.println ("Program started");
    }

}
