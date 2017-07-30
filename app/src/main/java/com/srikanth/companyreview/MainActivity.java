package com.srikanth.companyreview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.srikanth.companyreview.di.Injector;
import com.srikanth.companyreview.model.Company;
import com.srikanth.companyreview.model.Review;
import com.srikanth.companyreview.model.Salary;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    Button tester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tester = findViewById(R.id.tester);
        tester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Injector.provideService().getLatestCompanyInfo().enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        if (response.isSuccessful()) {
                            try {
                                ArrayList<Company> companies = parser(response.body().string());
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
        });
    }

    private ArrayList<Company> parser(String obj) {
        ArrayList<Company> companies = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(obj);
            JSONObject response = jsonObject.getJSONObject("response");
            JSONArray results = response.getJSONArray("results");
            Log.d("Test", "Number of items " + results.length());
            HashMap<String, Company> map = new HashMap<>();
            for (int i = 0; i < results.length(); i++) {
                JSONObject object = (JSONObject) results.get(i);
                String type = object.getString("type");
                if ("REVIEW_RESULT".equals(type)) {
                    Review review = new Review().loadFromJson(object.getJSONObject("review"));
                    Log.d("Test", review.getAdvice());
                    Company company;
                    if (map.containsKey(review.getEmployerName())) {
                        company = map.get(review.getEmployerName());
                    } else {
                        company = new Company(review.getEmployerName());
                    }
                    company.addReview(review);
                    map.put(review.getEmployerName(), company);
                    companies.add(company);
                } else if ("SALARY_RESULT".equals(type)){
                    Salary salary = new Salary().loadFromJson(object.getJSONObject("salary"));
                    Company company;
                    if (map.containsKey(salary.getEmployerName())) {
                        company = map.get(salary.getEmployerName());
                    } else {
                        company = new Company(salary.getEmployerName());
                    }
                    company.addSalary(salary);
                    map.put(salary.getEmployerName(), company);
                    companies.add(company);
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return companies;
    }
}
