package cn.wolfcode.mycat.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wolfcode.mycat.vo.User;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        int i = 1 / 0;
        return "hello";
    }

    @GetMapping("/validation")
    public String validationTest(@Validated User user) {
        return null;
    }

}