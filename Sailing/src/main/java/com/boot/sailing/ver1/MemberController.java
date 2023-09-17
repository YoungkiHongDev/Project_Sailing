package com.boot.sailing.ver1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @RequestMapping("/ver1/member")
    public String doMember() {

        return "/ver1/member/member";
    }
}
