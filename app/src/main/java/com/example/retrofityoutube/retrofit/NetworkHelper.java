package com.example.retrofityoutube.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkHelper {
    final static String url = "http://222.111.129.177";
  //  final static int port = 8000;
    private static Retrofit retrofit;

    public static NetworkInterface getInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit.create(NetworkInterface.class);
    }
}
