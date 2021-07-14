package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class GreetingController {
    @GetMapping("/greeting1")
    public String greeting1() {

        return "index";
    }
    @PostMapping("/greeting2")
    public String greeting2(@RequestParam String name, Model model) {
        model.addAttribute("name", name );
        return "start";
    }

}
