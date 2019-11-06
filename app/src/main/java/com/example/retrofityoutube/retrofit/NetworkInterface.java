package com.example.retrofityoutube.retrofit;

import com.example.retrofityoutube.model.RandomModel;
import com.example.retrofityoutube.model.VideoModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface NetworkInterface {


    @GET("/api/videos/")
    Call<ArrayList<VideoModel>>GetVideo();


    @GET("/api/videos/get_random")
    Call<ArrayList<RandomModel>>RandomVideo();




}
