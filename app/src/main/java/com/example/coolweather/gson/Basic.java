package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hust on 2018/7/20.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    private class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
