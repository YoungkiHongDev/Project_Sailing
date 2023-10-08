package com.boot.sailing.ver1.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2 // @Log4j2 롬복의 기능으로 이것을 통해 로그를 볼 수 있음
@Service // @Service IoC 컨테이너에 Bean으로 등록, 매번 객체를 생성하지 않고 컨테이너에 등록한 Bean을 재사용하도록 함
public class MenuService {

    public List<Map<String, Object>> doList(){
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

        Map<String, Object> mapThree = new HashMap<>();
        mapThree.put("no", "3");
        mapThree.put("name", "카푸치노");
        mapThree.put("kind", "커피");
        mapThree.put("price", "5,500");
        mapThree.put("regDay", "2023.09.22");
        mapThree.put("modDay", "2023.09.23");
        list.add(mapThree);

        // log를 통해 리스트가 잘 만들어졌는지 확인
        log.info(list);

        return list;
    }
}
