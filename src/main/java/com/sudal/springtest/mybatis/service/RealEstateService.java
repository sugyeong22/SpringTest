package com.sudal.springtest.mybatis.service;

import com.sudal.springtest.mybatis.domain.RealEstate;
import com.sudal.springtest.mybatis.repository.RealEatateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealEstateService {

    @Autowired
    private RealEatateRepository realEatateRepository;

    public List<RealEstate> getRealEstate(int id){

        List<RealEstate> realEstates = realEatateRepository.selectRealEatate(id);

        return realEstates;
    }

    public List<RealEstate> getRealEstateRent(int rent){

        List<RealEstate> realEstates = realEatateRepository.selectRealEatate1(rent);

        return realEstates;
    }

    public List<RealEstate> getRealAreaPrice(int area, int price){
        List<RealEstate> realEstates = realEatateRepository.selectRealEatate2(area, price);

        return realEstates;
    }
}
