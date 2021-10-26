package io.github.fujang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("QAQ")
    public String QAQ() {
        return "test_view";
    }

    @RequestMapping("testThymeleafView")
    public String testThymeleafView() {
        return "success";
    }

    @RequestMapping("testForward")
    public String testForward() {
        return "forward:testThymeleafView";
    }

    @RequestMapping("testRedirect")
    public String testRedirect() {

        return "redirect:testThymeleafView";
    }
}
