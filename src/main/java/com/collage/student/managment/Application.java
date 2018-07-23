package com.collage.student.managment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by dipankar on 13-07-2018.
 */

@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan("com.collage.student.managment.repo")

public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
