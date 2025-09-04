package com.sudal.springtest.mybatis;

import com.sudal.springtest.mybatis.domain.RealEstate;
import com.sudal.springtest.mybatis.service.RealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/mybatis/real-estate/select/")
@Controller
public class realeatateController {

    @Autowired
    private RealEstateService realEstateService;


    @ResponseBody
    @RequestMapping("/1")
    public List<RealEstate> realestate(@RequestParam("id") int id){

        List<RealEstate> realEstate = realEstateService.getRealEstate(id);

        return realEstate;
    }

    @ResponseBody
    @RequestMapping("/2")
    public List<RealEstate> realestate1(@RequestParam("rent") int rent){

        List<RealEstate> realEstate = realEstateService.getRealEstateRent(rent);

        return realEstate;
    }

    @ResponseBody
    @RequestMapping("/3")
    public List<RealEstate> realEstate2(@RequestParam("area") int area, @RequestParam("price") int price){
        List<RealEstate> realAreaPrice = realEstateService.getRealAreaPrice(area, price);

        return realAreaPrice;
    }
}
