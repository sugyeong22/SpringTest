package com.sudal.springtest.ajax;

import com.sudal.springtest.ajax.domain.Pension;
import com.sudal.springtest.ajax.service.PensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/ajax/pansion")
@Controller
public class PensionController {

    @Autowired
    private PensionService pensionService;

    @GetMapping("/list")
    public String pensionList(Model model){
        List<Pension> pensionList = pensionService.selectPansion();
        model.addAttribute("pensionList", pensionList);
        return "ajax/pansionList";
    }

    @GetMapping("/form")
    public String pentionForm(){
        return "ajax/pansionForm";
    }

    // 예약 추가 API
//    @PostMapping("/add")
//    public addReservation(
//            @RequestParam("name")String name
//            , @RequestParam("dateTime")LocalDateTime dateTime
//            , @RequestParam("day") int day
//            , @RequestParam("headCount") int headCount
//            , @RequestParam("phoneNumber") String phoneNumber
//
//            ){
//
//
//    }
}
