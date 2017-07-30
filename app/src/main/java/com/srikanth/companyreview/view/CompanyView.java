package com.srikanth.companyreview.view;

import com.srikanth.companyreview.model.Company;

import java.util.ArrayList;

public interface CompanyView {

    void showCompanyList(ArrayList<Company> companies);

    void showError(String error);
}
