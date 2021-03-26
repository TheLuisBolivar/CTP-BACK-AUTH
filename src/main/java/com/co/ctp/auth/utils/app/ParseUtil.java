package com.co.ctp.auth.utils.app;

import com.google.gson.Gson;

public class ParseUtil {

    public static <T> String objectLog(T object) {
        return (new Gson()).toJson(object);
    }
}
