package com.furkan.controller;

import com.furkan.business.restorant.RestorantManager;
import com.furkan.res.coreservices.domain.entity.Restorant;
import com.furkan.res.coreservices.domain.entity.RestorantMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestorantController {

    @Autowired
    RestorantManager restorantManager;

    @GetMapping("/api/test")
    public String doTest(){
        return "i am on...";
    }

    @GetMapping("/api/test/restorantlar")
    public List<Restorant> getAllRestorantlarTest(){
        return restorantManager.findAll();
    }

    @GetMapping("/api/getAllRestorantMenu")
    public List<RestorantMenu> getAllRestorantMenu(){
        return restorantManager.findAllRestorantMenu();
    }
}
