package com.example.sdbi.weatherjsontext.Gson;
import com.google.gson.annotations.SerializedName;

public class SK {
    public String temp;
    public String wind_direction;
    public String wind_strength;
    @SerializedName("humidity")
    public String humidity;
    public String time;

}
