package com.srikanth.companyreview.presenter;

import com.srikanth.companyreview.repository.CompanyRepository;
import com.srikanth.companyreview.view.CompanyView;

public class CompanyPresenterImpl implements CompanyPresenter {

    private CompanyView view;
    private CompanyRepository repository;

    @Override
    public void loadCompanyInfo() {

    }

    @Override
    public void setCompanyInof(CompanyView view) {

    }


    public CompanyView getView() {
        return view;
    }

    public void setView(CompanyView view) {
        this.view = view;
    }

    public CompanyRepository getRepository() {
        return repository;
    }

    public void setRepository(CompanyRepository repository) {
        this.repository = repository;
    }
}
