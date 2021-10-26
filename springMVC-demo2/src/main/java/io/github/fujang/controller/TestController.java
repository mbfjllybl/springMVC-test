package io.github.fujang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET, params = "username")
    public String test1() {
        return "test";
    }
    @RequestMapping(value = "/test2/{username}")
    public String test2(@PathVariable("username") String username) {
        System.out.println(username);
        return "test";
    }

    @RequestMapping("/test_param")
    public String param() {
        return "test_param";
    }
}
