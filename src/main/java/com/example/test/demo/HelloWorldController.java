package com.example.test.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld案例
 *
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/aa")
    public String sayHello() {
        return "Hello,World!!!!!!????";
    }
}
