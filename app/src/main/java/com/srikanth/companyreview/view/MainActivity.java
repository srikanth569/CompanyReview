package com.srikanth.companyreview.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.srikanth.companyreview.R;
import com.srikanth.companyreview.di.Injector;
import com.srikanth.companyreview.model.Company;
import com.srikanth.companyreview.presenter.CompanyPresenter;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener, CompanyView {

    Button tester;

    private CompanyPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tester = findViewById(R.id.tester);
        tester.setOnClickListener(this);
        presenter = new CompanyPresenter(this, Injector.provideService());

    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onClick(View view) {
        presenter.initDataSet();
    }

    @Override
    public void showCompanyList(ArrayList<Company> companies) {
        CompanyRecyclerAdapater adapater = new CompanyRecyclerAdapater(companies);
    }

    @Override
    public void showError(String error) {

    }
}
