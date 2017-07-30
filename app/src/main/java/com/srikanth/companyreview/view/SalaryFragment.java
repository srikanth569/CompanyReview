package com.srikanth.companyreview.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.srikanth.companyreview.R;
import com.srikanth.companyreview.model.Company;

public class SalaryFragment extends Fragment {
    private Company company;

    public static Fragment newInstance(Company company) {
        SalaryFragment salaryFragment = new SalaryFragment();
        Bundle args = new Bundle();
        args.putParcelable("COMPANY", company);
        salaryFragment.setArguments(args);
        return salaryFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        company = getArguments().getParcelable("COMPANY");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_salaries, container, false);
        TextView tvLabel = view.findViewById(R.id.salaryText);
        tvLabel.setText(company.getName());
        return view;
    }
}
