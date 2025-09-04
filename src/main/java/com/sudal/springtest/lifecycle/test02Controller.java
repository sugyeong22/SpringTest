package com.sudal.springtest.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test02Controller {
    @RequestMapping(("/lifecycle/test02"))
    public String tyhemleafResponse(){
        return("lifecycle/test02");
    }


}
