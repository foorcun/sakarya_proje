package com.furkan.controller;

import com.furkan.dao.restorant.RestorantRepository;
import com.furkan.res.coreservices.domain.entity.Restorant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestorantController {

    @Autowired
    RestorantRepository restorantRepository;

    @GetMapping("/api/test")
    public String doTest(){
        return "i am on...";
    }

    @GetMapping("/api/test/restorantlar")
    public List<Restorant> getAllRestorantlarTest(){
        return restorantRepository.findAll();
    }
}
