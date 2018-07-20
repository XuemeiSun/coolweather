package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hust on 2018/7/20.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    private class More {
        @SerializedName("txt")
        public String info;
    }
}
