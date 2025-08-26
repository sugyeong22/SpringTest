package com.sudal.springtest.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01Controller {

    @ResponseBody
    @RequestMapping("/lifecycle/test01/1")
    public String html(){
        String html = "" +
                "<html>\n" +
                "   <head><title>테스트 프로젝트</title></head>\n" +
                "   <body>\n" +
                "       <h2>테스트 프로젝트 완성</h2>\n" +
                "           <h4>해당 프로젝트를 통해서 문제 풀이를 진행 합니다.</h4>\n" +
                "   </body>\n" +
                "</html>";
        return html;
    }
}
