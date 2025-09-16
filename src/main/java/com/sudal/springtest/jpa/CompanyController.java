package com.sudal.springtest.jpa;

import com.sudal.springtest.jpa.domain.Company;
import com.sudal.springtest.jpa.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/jpa/company")
@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @ResponseBody
    @GetMapping("/add")
    public ArrayList<Company> addCompany(){
        ArrayList<Company> companyList = new ArrayList<>();
        Company company = companyService.createCompany("넥손", "컨텐츠 게임", "대기업", 3585);
        companyList.add(company);
        company = companyService.createCompany("버블팡", "여신 금융업", "대기업", 6834);
        companyList.add(company);
        return companyList;
    }


    @ResponseBody
    @GetMapping("/modify")
    public Company modifyCompany(){
        Company company = companyService.updateCompany(14, "중소기업", 34);

        return company;
    }

    @ResponseBody
    @GetMapping("/remove")
    public String removeCompany(){
        companyService.deleteCompany(14);
        return "삭제 완료";
    }
}
