package com.srikanth.companyreview.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.srikanth.companyreview.R;

public class SalaryFragment extends Fragment {
    private String title;

    public static Fragment newInstance(String company) {
        SalaryFragment salaryFragment = new SalaryFragment();
        Bundle args = new Bundle();
        args.putString("COMPANY", company);
        salaryFragment.setArguments(args);
        return salaryFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = getArguments().getString("COMPANY");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_salaries, container, false);
        TextView tvLabel = view.findViewById(R.id.salaryText);
        tvLabel.setText(title + " -- " + title);
        return view;
    }
}