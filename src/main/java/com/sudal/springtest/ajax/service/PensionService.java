package com.sudal.springtest.ajax.service;

import com.sudal.springtest.ajax.domain.Pension;
import com.sudal.springtest.ajax.repository.PensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PensionService {

    @Autowired
    private PensionRepository pensionRepository;

    public List<Pension> selectPansion(){
        List<Pension> pensionList = pensionRepository.selectPention();

        return pensionList;
    }

//    public int addReservation(){
//
//    }
}
