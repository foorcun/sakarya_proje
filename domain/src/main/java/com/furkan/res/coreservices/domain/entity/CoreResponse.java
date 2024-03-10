package com.furkan.res.coreservices.domain.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CoreResponse<V> {
    @JsonProperty("content")
    private List<V> valueList;
}
