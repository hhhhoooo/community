package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
