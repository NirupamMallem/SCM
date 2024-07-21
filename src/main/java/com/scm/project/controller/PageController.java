package com.scm.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home() {
        System.out.println("Home Handler");
        return "home";
    }

    @RequestMapping("/about")
    public String Aboutpage() {
        System.out.println("About page Loading");
        return "about";
    }

    @RequestMapping("/service")
    public String ServicePage() {
        System.out.println("Service Page Loading");
        return "service";
    }
}
