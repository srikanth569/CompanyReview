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

public class ReviewFragment extends Fragment {

    private Company company;
    private RecyclerView reviewRecycler;

    public static Fragment newInstance(Company company) {
        ReviewFragment reviewFragment = new ReviewFragment();
        Bundle args = new Bundle();
        args.putParcelable(Constants.COMPANY, company);
        reviewFragment.setArguments(args);
        return reviewFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        company = getArguments().getParcelable(Constants.COMPANY);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_review, container, false);
        reviewRecycler = view.findViewById(R.id.reviewRecycler);
        if (company.getReviews().size() == 0) {
            TextView emptyView = view.findViewById(R.id.emptyView);
            emptyView.setVisibility(View.VISIBLE);
            emptyView.setText(getString(R.string.no_reviews_to_display));
            reviewRecycler.setVisibility(View.GONE);
        } else {
            reviewRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
            ReviewAdapter reviewAdapter = new ReviewAdapter(company);
            reviewRecycler.setAdapter(reviewAdapter);
        }
        return view;
    }
}
