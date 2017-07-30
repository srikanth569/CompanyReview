package com.srikanth.companyreview.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.srikanth.companyreview.Constants;
import com.srikanth.companyreview.R;
import com.srikanth.companyreview.model.Company;

public class CompanyDetailsActivity extends FragmentActivity {

    PagerAdapter adapter;
    Company company;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_details);
        company = getIntent().getParcelableExtra(Constants.COMPANY);
        ViewPager viewPager = findViewById(R.id.vPager);
        adapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    public class PagerAdapter extends FragmentPagerAdapter {

        private int NUM_ITEMS = 2;

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return ReviewFragment.newInstance(company);
                case 1:
                    return SalaryFragment.newInstance(company);
            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return position == 0 ? getString(R.string.reviews) : getString(R.string.salaries);
        }
    }
}
