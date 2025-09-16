package com.sudal.springtest.jpa;

import com.sudal.springtest.jpa.domain.Recruit;
import com.sudal.springtest.jpa.repository.RecruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/jpa/recruit")
@Controller
public class RecruitController {

    //경고 controller에서 repository 바로 사용 금지
    @Autowired
    private RecruitRepository recruitRepository;

    @ResponseBody
    @GetMapping("/1")
    public List<Recruit> findRecruit1(){
        List<Recruit> recruit = null;

        recruit = recruitRepository.findById(8);

        return recruit;
    }

    @ResponseBody
    @GetMapping("/2")
    public List<Recruit> findRecruit2(@RequestParam("companyId") int companyId){


    }

}
