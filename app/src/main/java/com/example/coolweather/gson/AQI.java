package com.example.coolweather.gson;

/**
 * Created by hust on 2018/7/20.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
