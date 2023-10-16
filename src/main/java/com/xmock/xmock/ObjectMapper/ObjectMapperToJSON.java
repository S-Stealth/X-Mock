package com.xmock.xmock.ObjectMapper;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class ObjectMapperToJSON {

    public static String toJSON(Object object) {
        ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        String jsonData;
        try {
            jsonData = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            return "-1";
        }

        return jsonData;
    }
}
