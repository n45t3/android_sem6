package app.giantapp.rest;

/**
 * Created by Krystian on 2017-05-01.
 */

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {

    public static final String BASE_URL = "http://www.giantbomb.com/api/";
    public static final String API_KEY = "5362799318cf4a1600d9d569e9ff7fdf4f90eab0";
    public static final String FORMAT = "json";

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}