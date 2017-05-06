package app.giantapp.rest.Requests;

import android.util.Log;

import java.util.List;

import app.giantapp.model.GameRowModel;
import app.giantapp.model.Responses.GamesResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by WhoAmI on 06.05.2017.
 */

public class GetGames implements Callback<GamesResponse> {

    @Override
    public void onResponse(Call<GamesResponse> call, Response<GamesResponse> response) {
        List<GameRowModel> games = response.body().getResults();
        Log.d("GetGames", "Number of games received: " + games.size());

    }

    @Override
    public void onFailure(Call<GamesResponse> call, Throwable t) {
        Log.e("GetGames", t.toString());
    }
}
