package com.srikanth.companyreview.data;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GlassdoorService {


    @GET("feed.json")
    Call<ResponseBody> getLatestCompanyInfo();
}
