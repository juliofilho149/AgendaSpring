package com.segsat.springtester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SpringTesterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTesterApplication.class, args);
    }

}
