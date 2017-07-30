package com.srikanth.companyreview.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.srikanth.companyreview.R;
import com.srikanth.companyreview.model.Company;

import java.util.ArrayList;

public class CompanyRecyclerAdapter extends RecyclerView.Adapter<CompanyRecyclerAdapter.CompanyViewHolder> {

    ArrayList<Company> companies;

    public CompanyRecyclerAdapter(ArrayList<Company> companies) {
        this.companies = companies;
    }

    @Override
    public CompanyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.company_list, parent, false);
        return new CompanyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CompanyViewHolder holder, int position) {
        Company company = companies.get(position);
        holder.companyName.setText(company.getName());
        holder.reviews.setText("Reviews " + company.getReviews().size());
        holder.salaries.setText("Salaries " + company.getSalaries().size());
    }

    @Override
    public int getItemCount() {
        return companies.size();
    }

    public void setCompanies(ArrayList<Company> comapnies) {
        this.companies = comapnies;
        notifyDataSetChanged();
    }

    static class CompanyViewHolder extends RecyclerView.ViewHolder {
        TextView companyName;
        TextView salaries;
        TextView reviews;

        public CompanyViewHolder(View itemView) {
            super(itemView);
            companyName = itemView.findViewById(R.id.companyName);
            salaries = itemView.findViewById(R.id.salaries);
            reviews = itemView.findViewById(R.id.reviews);
        }
    }
}
