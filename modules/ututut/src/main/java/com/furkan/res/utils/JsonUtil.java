package com.furkan.res.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.net.URL;

public class JsonUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);

    public static <T> T fromResource(String resource, Class<T> tClass) {
        URL url = JsonUtil.class.getResource(resource);
        InputStream in = null;

        ObjectMapper jsonMapperv2 = new ObjectMapper();

        try {
            try {
                in = url.openStream();
                T obj = jsonMapperv2.readValue(in, tClass);
                return obj;
            }
            finally {
                if (in != null) {
                    in.close();
                }
            }
        }
        catch (Exception e) {
            LOGGER.error("Error during unmarshalling JSON file", e);
        }
        return null;
    }
}
