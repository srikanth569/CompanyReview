package com.srikanth.companyreview.presenter;

import android.util.Log;

import com.srikanth.companyreview.api.GlassdoorService;
import com.srikanth.companyreview.api.Parser;
import com.srikanth.companyreview.model.Company;
import com.srikanth.companyreview.view.CompanyView;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CompanyPresenter {

    private CompanyView view;
    private GlassdoorService glassdoorService;

    public CompanyPresenter(CompanyView view, GlassdoorService glassdoorService) {
        this.view = view;
        this.glassdoorService = glassdoorService;
    }

    public void initDataSet() {
        glassdoorService.getLatestCompanyInfo().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    try {
                        ArrayList<Company> companies = Parser.parse(response.body().string());
                        view.showCompanyList(companies);
                        Log.d("Test", String.valueOf(companies.size()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Log.d("Test", "Failure");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                view.showError("Unable to load company info");
            }
        });
    }

    public CompanyView getView() {
        return view;
    }

    public void setView(CompanyView view) {
        this.view = view;
    }

}
