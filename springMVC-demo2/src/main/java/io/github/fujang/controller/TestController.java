package io.github.fujang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET, params = "username")
    public String test() {
        return "test";
    }
}
