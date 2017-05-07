package app.giantapp.rest.Requests;

import android.util.Log;

import app.giantapp.model.Responses.GamesResponse;
import app.giantapp.rest.ApiClient;
import app.giantapp.rest.ApiInterface;
import retrofit2.Call;

/**
 * Created by WhoAmI on 06.05.2017.
 */

public class RequestManager {
    private  ApiInterface apiService;

    public RequestManager() {
        this.apiService = ApiClient.getClient().create(ApiInterface.class);
    }

    public void getGames(String gameName, int platformId, String afterDate, String sortField, String sortDirection){
        // sortDirection = asc | desc
        Call<GamesResponse> call = apiService.getGames("name:"+gameName+",platforms:"+platformId+",original_release_date:"+afterDate+"|2100-01-01",
                sortField+":"+sortDirection,ApiClient.FORMAT, ApiClient.API_KEY);
        //String url = call.request().url().toString();
        call.enqueue(new GetGames());
    }
}
