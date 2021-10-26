package io.github.fujang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jspController {

    @RequestMapping("/success")
    public String index() {
        return "success";
    }
}
