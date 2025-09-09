package com.sudal.springtest.ajax;

import com.sudal.springtest.ajax.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/ajax/favorit")
@Controller
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;


    // 즐거찾기 추가 API
    @ResponseBody
    @PostMapping("/add")
    public Map<String, String> addFavorit(
        @RequestParam("name") String name
        , @RequestParam("url") String url
    ){
        int count = favoriteService.addfavorit(name, url);

        // 성공 {"result":"success"}
        // 실패 {"result":"fail"}

        Map<String, String> resultMap = new HashMap<>();

        if(count == 1){
            resultMap.put("result","sucess");
        } else{
            resultMap.put("result","fail");
        }

        return resultMap;
    }

    @GetMapping("/form")
    public String favoritForm(){
        return "ajax/favoritForm";
    }

}
