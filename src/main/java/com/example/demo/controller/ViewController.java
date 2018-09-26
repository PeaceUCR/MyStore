package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

    @RequestMapping(value = {"/signin", "/signup", "/repository"}, method = RequestMethod.GET)
    public String home(){
        return "index.html";
    }
}
