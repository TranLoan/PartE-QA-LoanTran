package org.selenium.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;
import java.nio.file.Paths;
public class JacksonUtils {
    public static String getValueFromJsonFile(String filepath, String key){
        try {
            ObjectMapper mapper = new ObjectMapper();
            Map<?, ?> map = mapper.readValue(Paths.get(filepath).toFile(), Map.class);
            return (String) map.get(key);
        } catch (Exception e){
            return "";
        }
    }
}
