package com.srikanth.companyreview.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.srikanth.companyreview.Constants;
import com.srikanth.companyreview.R;
import com.srikanth.companyreview.model.Company;

public class SalaryFragment extends Fragment {
    private Company company;

    public static Fragment newInstance(Company company) {
        SalaryFragment salaryFragment = new SalaryFragment();
        Bundle args = new Bundle();
        args.putParcelable(Constants.COMPANY, company);
        salaryFragment.setArguments(args);
        return salaryFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        company = getArguments().getParcelable(Constants.COMPANY);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_salaries, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.salaryRecycler);
        if (company.getSalaries().size() == 0) {
            TextView emptyView = view.findViewById(R.id.emptyView);
            emptyView.setVisibility(View.VISIBLE);
            emptyView.setText(getString(R.string.no_salary_to_display));
            recyclerView.setVisibility(View.GONE);
        } else {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            SalaryAdapter adapter = new SalaryAdapter(company);
            recyclerView.setAdapter(adapter);
        }
        return view;
    }
}
