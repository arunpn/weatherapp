package com.example.a1nagar.weatherapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a1nagar.weatherapp.data.Channel;
import com.example.a1nagar.weatherapp.service.WeatherServiceCallback;
import com.example.a1nagar.weatherapp.service.YahooWeatherService;


public class WeatherActivity extends Activity implements WeatherServiceCallback {

    private ImageView weatherIconImageView;
    private TextView temperatureTextView;
    private TextView locationTextView;
    private TextView conditionTextView;

    private YahooWeatherService service;
    private ProgressDialog dialog;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        weatherIconImageView = (ImageView) findViewById(R.id.imageView);
        temperatureTextView = (TextView) findViewById(R.id.temperatureTextView);
        locationTextView = (TextView) findViewById(R.id.locationTextView);
        conditionTextView = (TextView) findViewById(R.id.conditionTextView);


        service = new YahooWeatherService(this);
        dialog = new ProgressDialog(this);
        dialog.setMessage("Loading");
        dialog.show();

        service.refreshWeather("Austin, TX");

    }

    @Override
    public void serviceSuccess(Channel channel) {
        dialog.hide();

    }

    @Override
    public void serviceFailure(Exception e) {

        dialog.hide();
        Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();

    }
}
