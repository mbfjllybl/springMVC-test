package io.github.fujang.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class TestController {
    @RequestMapping("/")
    public String test1() {
        return "index";
    }
}
