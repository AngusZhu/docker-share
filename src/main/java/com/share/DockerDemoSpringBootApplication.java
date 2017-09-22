package com.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@SpringBootApplication
public class DockerDemoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoSpringBootApplication.class, args);
    }

    @RequestMapping("/")
    public String hello(){
        return String.format("Hello! Docker!,%s",  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss").format(new Date()));
    }
}