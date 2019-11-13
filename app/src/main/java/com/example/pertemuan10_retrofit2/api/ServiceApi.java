package com.example.pertemuan10_retrofit2.api;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ServiceApi {

    String BASE_URL = "http://192.168.43.110:8080/api-image/";

    @Multipart
    @POST("index.php")
    Call<HashMap<String, String>> convertImage(
            @Part("image\"; filename=\"myfile.png\" ") RequestBody file,
            @Part("text") RequestBody name
    );

}
