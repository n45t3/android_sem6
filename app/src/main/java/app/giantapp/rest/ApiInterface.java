package app.giantapp.rest;

/**
 * Created by Krystian on 2017-05-01.
 */

import app.giantapp.model.Responses.GamesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("games")
    Call<GamesResponse> getGames(@Query("filter") String filter, @Query("sort") String sort, @Query("format") String format, @Query("api_key") String apiKey);
}
