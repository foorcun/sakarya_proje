package com.furkan.res.coreservices.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity // for specifies class is an entity and is mapped to a database table.
@Data // for getter and seter
public class Restorant {
    @Id
    @Column(name = "restorantId", nullable = false)
    String restorantId;
    String restorantName;
    String restorantMenuId;

    public String getRestorantId() {
        return restorantId;
    }

    public void setRestorantId(String restorantId) {
        this.restorantId = restorantId;
    }

    public String getRestorantName() {
        return restorantName;
    }

    public void setRestorantName(String restorantName) {
        this.restorantName = restorantName;
    }

    public String getRestorantMenuId() {
        return restorantMenuId;
    }

    public void setRestorantMenuId(String restorantMenuId) {
        this.restorantMenuId = restorantMenuId;
    }
}
