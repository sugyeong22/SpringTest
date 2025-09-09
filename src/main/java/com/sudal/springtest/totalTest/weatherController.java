package com.sudal.springtest.totalTest;

import com.sudal.springtest.totalTest.domain.weather;
import com.sudal.springtest.totalTest.service.weatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/totalTest")
@Controller
public class weatherController {

    @Autowired
    private weatherService weatherservice;

    @GetMapping("/weather/list")
    public String weather(Model model){
        // service에서 정보 얻어오기
        List<weather> list = weatherservice.selectWeather();

        // model 이용해서 xml로 넘기기
        model.addAttribute("weatherList",list);

        return "totalTest/weather";
    }

    @GetMapping("/weather/add")
    public String addWeather(@ModelAttribute weather weather) // RequestParameter 를 전달받기 위한 객체 = 객체를 파라미터로 받을 수 있음
//            @RequestParam("weather")String weather
//            //DateTimeFormat 어노테이션을 통해서 인식할 것 추가
//            , @DateTimeFormat(pattern="yyyy년 M월 d일") @RequestParam("date") LocalDate date
//            , @RequestParam("temperatures")double temperatures
//            , @RequestParam("precipitation")double precipitation
//            , @RequestParam("microDust")String microDust
//            , @RequestParam("windSpeed") double windSpeed
    {

        //int count = weatherservice.createWeather(weather, date, temperatures, precipitation, microDust, windSpeed);

            int count = weatherservice.createWeatherByObject(weather);

        return "redirect:/totalTest/weather/list";
    }

    @GetMapping("/weather/form")
    public String weatherForm(){
        return "totalTest/from";
    }
}
