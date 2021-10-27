package io.github.fujang.controller;

import io.github.fujang.bean.Employee;
import io.github.fujang.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {

    @Autowired
    private EmployeeDao employeeDao;
}
