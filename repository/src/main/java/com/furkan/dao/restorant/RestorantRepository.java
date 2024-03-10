package com.furkan.dao.restorant;

import com.furkan.res.coreservices.domain.entity.Restorant;
import com.furkan.res.utils.JsonUtil;
import com.furkan.res.utils.RestorantlarDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestorantRepository extends JpaRepository<Restorant, String> {


    @Override
    default List<Restorant> findAll() {
        return  JsonUtil.fromResource("/restorantlar.json", RestorantlarDB.class).getRestorantList();
    }
}
