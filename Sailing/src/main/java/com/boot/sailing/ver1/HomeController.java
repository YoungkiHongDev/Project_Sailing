package com.boot.sailing.ver1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "/ver1/home"})
    public String doHome() {

        return "/ver1/home/home";
    }
}
