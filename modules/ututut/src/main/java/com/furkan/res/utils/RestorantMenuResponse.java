package com.furkan.res.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.furkan.res.coreservices.domain.entity.RestorantMenu;
import lombok.Data;

import java.util.List;

public class RestorantMenuResponse {
    @JsonProperty("content")
    private List<RestorantMenu> valueList;

    public List<RestorantMenu> getValueList() {
        return valueList;
    }

    public void setValueList(List<RestorantMenu> valueList) {
        this.valueList = valueList;
    }
}
