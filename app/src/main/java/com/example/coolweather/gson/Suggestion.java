package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hust on 2018/7/20.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carwash;

    public Sports sports;

    private class Comfort {
        @SerializedName("txt")
        public String info;
    }

    private class CarWash {
        @SerializedName("txt")
        public String info;
    }

    private class Sports {
        @SerializedName("txt")
        public String info;
    }
}
