package app.giantapp.model.Responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.giantapp.model.GameRowModel;

/**
 * Created by Krystian on 2017-05-01.
 */

public class GamesResponse {
    @SerializedName("error")
    private String error;
    @SerializedName("results")
    private List<GameRowModel> results;

    public List<GameRowModel> getResults() {
        return results;
    }

    public void setResults(List<GameRowModel> results) {
        this.results = results;
    }

    public String getError() {
        return error;
    }
}