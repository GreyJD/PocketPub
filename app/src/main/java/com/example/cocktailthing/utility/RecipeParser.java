package com.example.cocktailthing.utility;

import android.util.Log;

import com.example.cocktailthing.model.RecipeModel;
import com.example.cocktailthing.model.RecipeResponse;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class RecipeParser {
    // TAG is used in logging, to help trace where output comes from
    private static final String TAG = "RecipeParser";

    /**
     * Returns a list of recipes that match a search term
     *
     * @param json String json representing the server's response
     * @return list of recipes (as RecipeModels)
     */
    public static List<RecipeModel> getMatches(String json) {

        // todo: use Gson to deserialize `json` into a ResponseModel
        //create an instance of Gson
        Gson gson = new Gson();

        //use Gson to deserialize the JSON and create a RecipeResponse
        RecipeResponse response = gson.fromJson(json, RecipeResponse.class);

        // get list of RecipeModels from the ResponseModel and return
        return response.getRecipes();
    }

    /**
     * Gets total number of matched recipes in a search result.
     *
     * @param json string json representing the server's response
     * @return integer number of total matches
     */
    public static int getTotalMatches(String json) {
        int totalMatches = 0;

        try {
            // convert the raw string into a Java JSONObject
            JSONObject response = new JSONObject(json);

            // deserialize an integer
            totalMatches = response.getInt("totalMatchCount");

        } catch (JSONException e) {
            Log.e(TAG, "getTotalMatches: error parsing JSON", e);
        }

        return totalMatches;
    }
}
