package com.sudal.springtest.ajax.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FavoritRepository {

    public int insertFavorit(
            @Param("name")String name
            , @Param("url")String url
    );
}
