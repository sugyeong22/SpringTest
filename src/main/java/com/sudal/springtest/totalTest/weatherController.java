package com.sudal.springtest.totalTest;

import com.sudal.springtest.totalTest.domain.weather;
import com.sudal.springtest.totalTest.service.weatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class weatherController {

    @Autowired
    private weatherService weatherservice;

    @GetMapping("/totalTest/weather")
    public String weather(Model model){
        // service에서 정보 얻어오기
        List<weather> list = weatherservice.selectWeather();

        // model 이용해서 xml로 넘기기
        model.addAttribute("weatherList",list);

        return "totalTest/weather";
    }
}
