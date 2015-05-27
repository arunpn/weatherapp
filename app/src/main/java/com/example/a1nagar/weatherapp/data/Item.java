package com.example.a1nagar.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by a1nagar on 5/26/15.
 */
public class Item implements JSONPopulator {

    public Condition getCondition() {
        return condition;
    }

    private Condition condition;

    @Override
    public void populate(JSONObject data) {

        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));


    }
}
