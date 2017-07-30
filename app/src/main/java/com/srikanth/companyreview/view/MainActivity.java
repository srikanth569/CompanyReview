package com.srikanth.companyreview.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.srikanth.companyreview.R;
import com.srikanth.companyreview.di.Injector;
import com.srikanth.companyreview.model.Company;
import com.srikanth.companyreview.presenter.CompanyPresenter;

import java.util.ArrayList;

public class MainActivity extends Activity implements CompanyView, CompanyRecyclerAdapter.CompanyClickListener {

    private static final String EXTRA_COMPANY = "company";
    private CompanyPresenter presenter;
    private CompanyRecyclerAdapter adapter;
    private RecyclerView companyRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        companyRecycler = findViewById(R.id.companyRecycler);
        presenter = new CompanyPresenter(this, Injector.provideService());
        adapter = new CompanyRecyclerAdapter(new ArrayList<Company>(), this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        companyRecycler.setLayoutManager(layoutManager);
        companyRecycler.setAdapter(adapter);
        presenter.initDataSet();
    }

    @Override
    public void showCompanyList(ArrayList<Company> companies) {
        adapter.setCompanies(companies);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, "Error loading data", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCompanyClicked(Company company) {
        Log.d("Test", "Clicked on " + company.getName());
        Intent intent = new Intent(this, CompanyDetailsActivity.class);
        intent.putExtra(EXTRA_COMPANY, company);
        startActivity(intent);
    }
}
