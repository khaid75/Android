package com.example.advancejson;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("products")
    Call<List<Model>>getPost();
}
