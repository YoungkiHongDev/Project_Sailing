package com.boot.sailing.ver1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    @RestController는 데이터를 반환하기 위한 컨트롤러이다.
    @RestController에서 HTML태그를 생성할 수 있다. (하지만 일반적으로는 템플릿 엔진 사용)
    @RestController는 @Controller에 @ResponseBody 추가한 것과 같다.
    @RestController는 JSON 객체를 반환하거나 REST API를 개발하는 데 주로 활용된다.
*/
@RestController
public class RestHome {

    @GetMapping("ver1/rest")
    public String doRest() {
        String strHtml= "<html><body>" +
                            "<h1>Hi Rest Controller!!</h1>" +
                        "</body></html>";
        return strHtml;
    }
}
