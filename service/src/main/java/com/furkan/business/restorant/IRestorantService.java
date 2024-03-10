package com.furkan.business.restorant;

import java.util.List;
import com.furkan.res.coreservices.domain.entity.Restorant;
import com.furkan.res.coreservices.domain.entity.RestorantMenu;


public interface IRestorantService {
    public List<Restorant> findAll();


    public List<RestorantMenu> findAllRestorantMenu();

}
