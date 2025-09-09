package com.sudal.springtest.ajax.service;

import com.sudal.springtest.ajax.repository.FavoritRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteService {

    @Autowired
    private FavoritRepository favoritRepository;

    // insert할 service 만들어야함
    public int addfavorit(String name, String url){
        int count = favoritRepository.insertFavorit(name, url);
        return count;
    }
}
