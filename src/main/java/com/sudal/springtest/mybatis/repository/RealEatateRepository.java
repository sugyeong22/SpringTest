package com.sudal.springtest.mybatis.repository;

import com.sudal.springtest.mybatis.domain.RealEstate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RealEatateRepository {

    public List<RealEstate> selectRealEatate(@Param("id") int id);
    public List<RealEstate> selectRealEatate1(@Param("rent") int rent);
    public List<RealEstate> selectRealEatate2(@Param("area") int area, @Param("price") int price);
}
