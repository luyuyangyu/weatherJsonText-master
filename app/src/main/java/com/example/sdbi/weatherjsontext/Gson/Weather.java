package com.example.sdbi.weatherjsontext.Gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Weather {
    @SerializedName("sk")
    public SK sk;
    @SerializedName("today")
    public Today today;
    @SerializedName("future")
    public List<Future> futureList;
}
