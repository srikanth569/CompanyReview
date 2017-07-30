package com.srikanth.companyreview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.srikanth.companyreview.R;
import com.srikanth.companyreview.api.Parser;
import com.srikanth.companyreview.di.Injector;
import com.srikanth.companyreview.model.Company;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity implements View.OnClickListener {

    Button tester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tester = findViewById(R.id.tester);
        tester.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Injector.provideService().getLatestCompanyInfo().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    try {
                        ArrayList<Company> companies = Parser.parse(response.body().string());
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
                new Throwable(t);
            }
        });
    }
}
