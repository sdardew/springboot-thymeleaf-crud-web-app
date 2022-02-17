package com.example.springbootthymeleafcrudwebapp.controller;

import com.example.springbootthymeleafcrudwebapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // display list of employees
    @GetMapping("/")
    public String viewHomepage(Model model) {
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "index";
    }
}
