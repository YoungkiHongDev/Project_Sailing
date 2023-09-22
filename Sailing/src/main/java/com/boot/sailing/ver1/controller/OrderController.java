package com.boot.sailing.ver1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @RequestMapping("/ver1/order")
    public String doOrder() {

        return "/ver1/order/order";
    }
}
