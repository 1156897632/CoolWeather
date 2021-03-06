package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/8/23.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature tempera;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
