package com.boot.sailing.ver1.controller;

import com.boot.sailing.ver1.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MenuController {

    @Autowired // IoC 컨테이너에 등록된 Bean을 주입받아서 사용
    MenuService menuService;

    @RequestMapping("/ver1/menu")
    public String doMenu(Model model) {

        // Data 만들기 - MenuService에서 데이터 가져오기
        List<Map<String, Object>> list = menuService.doList();

        // Data 송부
        model.addAttribute("list", list);
        model.addAttribute("hello", "======= MenuController =======");

        return "/ver1/menu/menu";
    }
}
