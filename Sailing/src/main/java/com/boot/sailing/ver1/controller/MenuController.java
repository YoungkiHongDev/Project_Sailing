package com.boot.sailing.ver1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MenuController {

    @RequestMapping("/ver1/menu")
    public String doMenu(Model model) {

        // Data 만들기 - List, Map
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> mapOne = new HashMap<>();
        mapOne.put("no", "1");
        mapOne.put("name", "아메리카노");
        mapOne.put("kind", "커피");
        mapOne.put("price", "2,500");
        mapOne.put("regDay", "2023.09.22");
        mapOne.put("modDay", "2023.09.23");
        list.add(mapOne);

        Map<String, Object> mapTwo = new HashMap<>();
        mapTwo.put("no", "2");
        mapTwo.put("name", "카페라떼");
        mapTwo.put("kind", "커피");
        mapTwo.put("price", "3,500");
        mapTwo.put("regDay", "2023.09.22");
        mapTwo.put("modDay", "2023.09.23");
        list.add(mapTwo);

        // Data 송부
        model.addAttribute("list", list);
        model.addAttribute("hello", "======= MenuController =======");

        return "/ver1/menu/menu";
    }
}
