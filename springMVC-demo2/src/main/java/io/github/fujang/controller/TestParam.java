package io.github.fujang.controller;

import io.github.fujang.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
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
    public String test2(String username, @RequestParam("pass_word") String password, @RequestHeader("host") String host, @CookieValue("JSESSIONID") String cookie) {
        System.out.println(username + " " + password + "!!");
        System.out.println(host);
        System.out.println(cookie);
        return "test";
    }

    @RequestMapping("/testPOJO")
    public String test3(Person person) {
        System.out.println(person);
        return "test";
    }


}
