package com.furkan.res.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonUtilTest {

    @Test
    void fromResource() {
        RestorantlarDB listRestorant = JsonUtil.fromResource("/restorantlar.json", RestorantlarDB.class);
        System.out.println(listRestorant.getRestorantList().get(0).getRestorantId());

        assertEquals("res1",listRestorant.getRestorantList().get(0).getRestorantId());
    }
}