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
    CompanyClickListener companyClickListener;

    public CompanyRecyclerAdapter(ArrayList<Company> companies, CompanyClickListener companyClickListener) {
        this.companies = companies;
        this.companyClickListener = companyClickListener;
    }

    @Override
    public CompanyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.company_list, parent, false);
        return new CompanyViewHolder(view, companyClickListener);
    }

    @Override
    public void onBindViewHolder(CompanyViewHolder holder, int position) {
        Company company = companies.get(position);
        holder.companyName.setText(company.getName());
        holder.reviews.setText(holder.reviews.getContext().getString(R.string.reviews_format, company.getReviews().size()));
        holder.salaries.setText(holder.salaries.getContext().getString(R.string.salries_format, company.getSalaries().size()));
    }

    @Override
    public int getItemCount() {
        return companies.size();
    }

    public void setCompanies(ArrayList<Company> companies) {
        this.companies = companies;
        notifyDataSetChanged();
    }

    public class CompanyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView companyName;
        private TextView salaries;
        private TextView reviews;
        private CompanyClickListener companyListener;

        public CompanyViewHolder(View itemView, CompanyClickListener clickListener) {
            super(itemView);
            companyName = itemView.findViewById(R.id.companyName);
            salaries = itemView.findViewById(R.id.salaries);
            reviews = itemView.findViewById(R.id.reviews);
            itemView.setOnClickListener(this);
            this.companyListener = clickListener;
        }

        @Override
        public void onClick(View view) {
            companyListener.onCompanyClicked(companies.get(getAdapterPosition()));
        }
    }

    public interface CompanyClickListener {
        void onCompanyClicked(Company company);
    }
}
