package com.furkan.business.restorant;

import com.furkan.dao.restorant.RestorantMenuRepository;
import com.furkan.res.coreservices.domain.entity.Restorant;
import com.furkan.res.coreservices.domain.entity.RestorantMenu;
import org.springframework.beans.factory.annotation.Autowired;
import com.furkan.dao.restorant.RestorantRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RestorantManager implements IRestorantService{

    @Autowired
    RestorantRepository restorantRepository;

    @Autowired
    RestorantMenuRepository restorantMenuRepository;

    @Override
    public List<Restorant> findAll() {
      return  restorantRepository.findAll();
    }

    @Override
    public List<RestorantMenu> findAllRestorantMenu() {
        return restorantMenuRepository.findAll();
    }
}
