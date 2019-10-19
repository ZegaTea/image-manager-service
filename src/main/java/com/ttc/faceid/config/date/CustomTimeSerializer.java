package com.ttc.faceid.config.date;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.sql.Time;
import java.text.SimpleDateFormat;

/**
 * Created by tudv on 2019/10/08
 */
public class CustomTimeSerializer implements JsonSerializer<Time> {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public JsonElement serialize(Time date, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(dateFormat.format(date));
    }
}
