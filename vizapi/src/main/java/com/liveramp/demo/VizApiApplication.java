package com.liveramp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * description: VizApiApplication
 * date: 2021/11/3 3:55 PM
 * author: twu
 * version: 1.0
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class},scanBasePackages = {"com.liveramp.demo"})
public class VizApiApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(VizApiApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
