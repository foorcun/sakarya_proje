package com.furkan.dao.restorant;

import com.fasterxml.jackson.core.type.TypeReference;
import com.furkan.res.coreservices.domain.entity.CoreResponse;
import com.furkan.res.coreservices.domain.entity.Restorant;
import com.furkan.res.coreservices.domain.entity.RestorantMenu;
import com.furkan.res.utils.JsonUtil;
import com.furkan.res.utils.RestorantMenuResponse;
import com.furkan.res.utils.RestorantlarDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestorantMenuRepository extends JpaRepository<RestorantMenu, String> {

    @Override
    default List<RestorantMenu> findAll() {
        return JsonUtil.fromResource("/restorantMenu.json", RestorantMenuResponse.class).getValueList();
//        return null;
    }

}
