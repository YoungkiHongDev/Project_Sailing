package com.boot.sailing.ver1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

    @RequestMapping("/ver1/menu")
    public String doMenu() {

        return "/ver1/menu/menu";
    }
}
