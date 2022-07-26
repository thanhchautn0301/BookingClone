package com.booking.apis;
import com.booking.helpers.TokenReader;
import com.google.gson.GsonBuilder;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class APIClient {
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder client = new OkHttpClient.Builder().addInterceptor(interceptor)
                .addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder().addHeader("Authorization", "Bearer "+TokenReader.accessToken).build();
                return chain.proceed(request);
            }
        });

        retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:9596/api/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setDateFormat("dd/MM/yyyy").create()))
                .client(client.build())
                .build();
        return retrofit;
    }
}