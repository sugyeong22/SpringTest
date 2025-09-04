package com.sudal.springtest.database.service;

import com.sudal.springtest.database.domain.Stores;
import com.sudal.springtest.database.repositrory.StoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoresService {
    // 객체
    @Autowired
    private StoresRepository storesRepository;

    // 정보 얻어오기
    public List<Stores> getStoresList(){

        List<Stores> storesList = storesRepository.selectStoresList();
        return storesList;

    }
}
