package com.boot.sailing.ver1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ver1")
public class HomeController {

    @RequestMapping("/home")
    public String doHome() {
        System.out.println("Request");
        return "/ver1/home/home";
    }

    @GetMapping("/home2")
    public String doHome2Get() {
        System.out.println("Get");
        return "/ver1/home/home";
    }

    @PostMapping("/home2")
    public String doHome2Post() {
        System.out.println("Post");
        return "/ver1/home/home";
    }
}
