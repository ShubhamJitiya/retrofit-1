package com.shubhamjitiya.retrofit1;
/*
Reference to host json: https://jsonkeeper.com/b/O4E7
*/
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface myapi {
    @GET("O4E7")
    Call<List<model>> getmodels();
}
