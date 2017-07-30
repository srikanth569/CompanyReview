package com.srikanth.companyreview.di;

import com.srikanth.companyreview.Constants;
import com.srikanth.companyreview.api.GlassdoorService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Injector {

    public static Retrofit provideRetroFit(String baseURL) {
        return new Retrofit.Builder().baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static GlassdoorService provideService() {
        return provideRetroFit(Constants.BASE_URL).create(GlassdoorService.class);
    }
}
