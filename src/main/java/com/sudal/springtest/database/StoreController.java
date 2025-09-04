package com.sudal.springtest.database;

import com.sudal.springtest.database.domain.Stores;
import com.sudal.springtest.database.service.StoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StoreController {

    @Autowired
    private StoresService storesService;

    @RequestMapping("/db/stores/list")
    @ResponseBody
    public List<Stores> storesList(){
        List<Stores> storesList = storesService.getStoresList();

        return storesList;
    }
}
