package com.srikanth.companyreview.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.srikanth.companyreview.R;

public class CompanyDetailsActivity extends Activity {

    private static final String EXTRA_BOOK_ID = "book";
    private TextView companyName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_details);
        companyName = findViewById(R.id.companyDetailsName);
        String name = getIntent().getStringExtra(EXTRA_BOOK_ID);
        companyName.setText(name);

    }
}
