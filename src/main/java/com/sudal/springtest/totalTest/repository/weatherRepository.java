package com.sudal.springtest.totalTest.repository;

import com.sudal.springtest.totalTest.domain.weather;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface weatherRepository {

    public List<weather> selectWeather();

    public int insertWeather(
            @Param("weather") String weather
            , @Param("date") LocalDate date
            , @Param("temperatures")double temperatures
            , @Param("precipitation")double precipitation
            , @Param("microDust")String microDust
            , @Param("windSpeed")double windSpeed);

    public int insertWeatherByObject(weather weather);

}

