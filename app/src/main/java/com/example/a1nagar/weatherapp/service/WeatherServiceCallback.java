package com.example.a1nagar.weatherapp.service;

import com.example.a1nagar.weatherapp.data.Channel;

/**
 * Created by a1nagar on 5/26/15.
 */
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception e);
}
