package com.example.a1nagar.weatherapp.service;

import android.os.AsyncTask;

/**
 * Created by a1nagar on 5/26/15.
 */
public class YahooWeatherService {
    private WeatherServiceCallback callback;

    private String location;

    public YahooWeatherService(WeatherServiceCallback callback) {
        this.callback = callback;

    }

    public String getLocation() {
        return location;
    }

    public void refreshWeather(String location) {

        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... strings) {
                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
            }

        }.execute(location);

    }


}
