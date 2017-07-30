package com.srikanth.companyreview.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.srikanth.companyreview.R;
import com.srikanth.companyreview.model.Company;
import com.srikanth.companyreview.model.Salary;

import java.util.List;

public class SalaryAdapter extends RecyclerView.Adapter<SalaryAdapter.SalaryViewHolder> {

    List<Salary> salaryList;

    public SalaryAdapter(Company company) {
        salaryList = company.getSalaries();
    }

    @Override
    public SalaryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_salary, parent, false);
        return new SalaryAdapter.SalaryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SalaryViewHolder holder, int position) {
        Salary salary = salaryList.get(position);
        holder.salaryJobTitle.setText(salary.getJobTitle());
        holder.salaryInfo.setText(String.valueOf(salary.getBasePay().getAmount()));
        holder.salaryCurrency.setText(String.valueOf(salary.getBasePay().getSymbol()));
    }

    @Override
    public int getItemCount() {
        return salaryList == null ? 0 : salaryList.size();
    }

    class SalaryViewHolder extends RecyclerView.ViewHolder {

        TextView salaryJobTitle;
        TextView salaryInfo;
        TextView salaryCurrency;

        public SalaryViewHolder(View itemView) {
            super(itemView);
            salaryJobTitle = itemView.findViewById(R.id.salaryJobTitle);
            salaryInfo = itemView.findViewById(R.id.salaryInfo);
            salaryCurrency = itemView.findViewById(R.id.salaryCurrency);
        }
    }
}
