package com.srikanth.companyreview.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.srikanth.companyreview.model.Company;

import java.util.ArrayList;

public class CompanyRecyclerAdapater extends RecyclerView.Adapter<CompanyRecyclerAdapater.CompanyViewHolder> {

    ArrayList<Company> companies;

    public CompanyRecyclerAdapater(ArrayList<Company> companies) {
        this.companies = companies;
    }


    @Override
    public CompanyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CompanyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class CompanyViewHolder extends RecyclerView.ViewHolder {

        public CompanyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
