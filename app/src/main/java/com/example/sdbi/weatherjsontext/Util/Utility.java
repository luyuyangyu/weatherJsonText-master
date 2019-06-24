package com.example.sdbi.weatherjsontext.Util;

import android.util.Log;

import com.example.sdbi.weatherjsontext.Gson.Weather;
import com.google.gson.Gson;

import org.json.JSONObject;

public class Utility {
    public static Weather handleWeatherResponse(String response){
        try{
            /**
             JSONObject jsonObject = new JSONObject(response);
             JSONArray jsonArray = jsonObject.getJSONArray("result");
             String weatherContent = jsonArray.getJSONObject(0).toString();
             return new Gson().fromJson(weatherContent,Code.class);
             **/

            JSONObject jsonObject = new JSONObject(response);
            String resultcode = jsonObject.getString("resultcode");
            String reason = jsonObject.getString("reason");
            String weatherContent = jsonObject.getString("result");
            Log.d("RUN",resultcode);
            Log.d("RUN",reason);
            Log.d("RUN",weatherContent);
            return new Gson().fromJson(weatherContent, Weather.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
