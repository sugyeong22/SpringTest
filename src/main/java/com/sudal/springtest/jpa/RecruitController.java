package com.sudal.springtest.jpa;

import com.sudal.springtest.jpa.domain.Recruit;
import com.sudal.springtest.jpa.repository.RecruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/jpa/recruit")
@Controller
public class RecruitController {

    //경고 controller에서 repository 바로 사용 금지
    @Autowired
    private RecruitRepository recruitRepository;

    @ResponseBody
    @GetMapping("/1")
    public List<Recruit> findRecruit1(){
        List<Recruit> recruit = recruitRepository.findById(8);

        return recruit;
    }

    @ResponseBody
    @GetMapping("/2")
    public List<Recruit> findRecruit2(@RequestParam("companyId") int companyId){

        List<Recruit> recruit = recruitRepository.findById(companyId);
        return recruit;

    }

    @ResponseBody
    @GetMapping("/3")
    public List<Recruit> findRecruit3(){
        List<Recruit> recruit = null;

        // recruit = recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
        // Greater인데 이상값이 안나옴..
        //recruit = recruitRepository.findByTypeOrSalaryGreaterThan("정규직", 9000);
        //recruit = recruitRepository.findTop3ByTypeOrderBySalaryDesc("계약직");
        // recruit = recruitRepository.findBySalaryBetween(7000,8500);
        recruit = recruitRepository.madeQuery(LocalDate.of(2026,04,10), 8100, "정규직");
        return recruit;
    }




}
