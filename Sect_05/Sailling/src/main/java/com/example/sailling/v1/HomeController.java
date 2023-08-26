package com.example.sailling.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //경로 여러개 지정 -> {} 괄호를 사용하여 경로를 묶어줌
    @RequestMapping({"/", "/v1/home"})
    public String doHome() {
        return "/v1/home/home";
    }
}
