package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.security.BasicPermission;
import java.util.List;

/**
 * Created by hust on 2018/7/20.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
