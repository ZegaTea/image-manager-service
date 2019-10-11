package com.ttc.faceid.global;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by tudv on 2019/09/14
 */
public class GlobalObjects {
    public static final Gson gson = new GsonBuilder().create();
    public static final Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
    public static final Gson gsonNull = new GsonBuilder()
            .setPrettyPrinting()
            .serializeNulls()
            .excludeFieldsWithoutExposeAnnotation()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    static {

    }

}
