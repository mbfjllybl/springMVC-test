package io.github.fujang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class TestParam {
    @RequestMapping("/testQAQ")
    public String test1(HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));
        return "test";
    }

    @RequestMapping("/testQAQ2")
    public String test2(String username, @RequestParam("pass_word") String password) {
        System.out.println(username + " " + password);
        return "test";
    }
}
