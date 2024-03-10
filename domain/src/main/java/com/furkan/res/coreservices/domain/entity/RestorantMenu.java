package com.furkan.res.coreservices.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Entity
@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
public class RestorantMenu {
    @Id
    @Column(name = "restorantMenuId", nullable = false)
    String restorantMenuId;
    String restorantId;

    @JdbcTypeCode(SqlTypes.JSON)
    List<Menu> menuList;

    public String getRestorantMenuId() {
        return restorantMenuId;
    }

    public void setRestorantMenuId(String restorantMenuId) {
        this.restorantMenuId = restorantMenuId;
    }

    public String getRestorantId() {
        return restorantId;
    }

    public void setRestorantId(String restorantId) {
        this.restorantId = restorantId;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}
