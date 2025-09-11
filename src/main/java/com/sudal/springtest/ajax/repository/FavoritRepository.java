package com.sudal.springtest.ajax.repository;

import com.sudal.springtest.ajax.domain.Favorit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface FavoritRepository {

    public int insertFavorit(
            @Param("name")String name
            , @Param("url")String url
    );

    public List<Favorit> selectFavorit();

    public int duplicateUrl(@Param("url") String url);

    public int deleteFavorite(@Param("id") int id);
}
