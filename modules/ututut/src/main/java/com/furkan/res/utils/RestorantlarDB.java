package com.furkan.res.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.furkan.res.coreservices.domain.entity.Restorant;

import java.util.List;

public class RestorantlarDB {
    @JsonProperty("restorantlar")
    List<Restorant> restorantList;

    public List<Restorant> getRestorantList() {
        return restorantList;
    }

    public void setRestorantList(List<Restorant> restorantList) {
        this.restorantList = restorantList;
    }
}
