package io.github.fujang.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class TestController {
//    @RequestMapping("/")
//    public String index() {
//        System.out.println(111);
//        return "index";
//    }

    @RequestMapping("/test1")
    public String test1(HttpServletRequest request) {
        request.setAttribute("name","fujang");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView test2() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("name","mbfjllybl");
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/testMode")
    public String test3(Model model) {
        model.addAttribute("name", "mbfjllybl2");
        return "success";
    }

    @RequestMapping("/testMap")
    public String test4(Map<String, Object> map) {
        map.put("name", "hello mbf3");
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String test5(ModelMap modelMap) {
        modelMap.addAttribute("name", "emmmmm5");
        return "success";
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session) {
        session.setAttribute("name", "value");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session) {
        ServletContext application = session.getServletContext();
        application.setAttribute("name", "fuck!");
        return "success";
    }

}
