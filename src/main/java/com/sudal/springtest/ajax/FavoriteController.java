package com.sudal.springtest.ajax;

import com.sudal.springtest.ajax.domain.Favorit;
import com.sudal.springtest.ajax.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/ajax/favorit")
@Controller
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    // 중복확인 API
    @ResponseBody
    @GetMapping("/duplicate-url")
    public Map<String,Boolean> isDuplicateUrl(@RequestParam("url") String url){
        // 중복확인
        // 넘길 값 만들기
        Map<String,Boolean> duplicateMap = new HashMap<>();

        if(favoriteService.isDuplicateUrl(url)){
            duplicateMap.put("duplicate",true);
        } else{
            duplicateMap.put("duplicate",false);
        }
        return duplicateMap;
    }

    // 즐거찾기 추가 API
    @ResponseBody
    @PostMapping("/add")
    public Map<String, String> addFavorit(
    //public String addFavorit(
        @RequestParam("name") String name
        , @RequestParam("url") String url
        //, Model model
    ){
        int count = favoriteService.addfavorit(name, url);

        // 성공 {"result":"success"}
        // 실패 {"result":"fail"}

        Map<String, String> resultMap = new HashMap<>();

        if(count == 1){
            resultMap.put("result","success");
        } else{
            resultMap.put("result","fail");
        }

        //model.addAttribute("resultMap",resultMap);

        return resultMap;
        //return "redirect:/ajax/favorit/info";
    }

    @GetMapping("/form")
    public String favoritForm(){
        return "ajax/favoritForm";
    }

    @GetMapping("/info")
    public String favoritInfo(Model model){
        List<Favorit> favoritList = favoriteService.selectFavorit();
        model.addAttribute("favoritList",favoritList);
        return "ajax/favoritInfo";
    }
}
