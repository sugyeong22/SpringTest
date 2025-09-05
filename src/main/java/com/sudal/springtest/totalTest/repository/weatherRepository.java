package com.sudal.springtest.totalTest.repository;

import com.sudal.springtest.totalTest.domain.weather;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface weatherRepository {

    public List<weather> selectWeather();
}
