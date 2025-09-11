package com.sudal.springtest.ajax.service;

import com.sudal.springtest.ajax.domain.Favorit;
import com.sudal.springtest.ajax.repository.FavoritRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    @Autowired
    private FavoritRepository favoritRepository;

    // insert할 service 만들어야함
    public int addfavorit(String name, String url){
        int count = favoritRepository.insertFavorit(name, url);
        return count;
    }

    public List<Favorit> selectFavorit(){
        List<Favorit> favoritList= favoritRepository.selectFavorit();
        return favoritList;
    }

    // 중복 확인 service
    public Boolean isDuplicateUrl(String url){
       int count = favoritRepository.duplicateUrl(url);
       if(count > 0){
           return true;
       } else{
           return false;
       }
    }

    // 즐겨찾기 삭제 기능
    public int deleteFavorit(int id){
        int count = favoritRepository.deleteFavorite(id);

        return count;
    }
}
