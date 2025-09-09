package com.sudal.springtest.totalTest.service;

import com.sudal.springtest.totalTest.domain.weather;
import com.sudal.springtest.totalTest.repository.weatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class weatherService {

    @Autowired
    private weatherRepository weatherRepository;

    // repository에서 정보 가져와서 활용
    public List<weather> selectWeather(){
        List<weather> weatherList = weatherRepository.selectWeather();
        return weatherList;
    }

    public int createWeather(
            String weather
            , LocalDate date
            , double temperatures
            , double precipitation
            , String microDust
            ,double windSpeed
    ){
        int count = weatherRepository.insertWeather(weather,date,temperatures,precipitation,microDust,windSpeed);
        return count;
    }

    public int createWeatherByObject(weather weather){
        int count = weatherRepository.insertWeatherByObject(weather);
        return count;
    }
}
