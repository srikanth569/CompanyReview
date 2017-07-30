package com.srikanth.companyreview.model;

import java.util.ArrayList;
import java.util.List;

public class Company {

    String name;
    List<Review> reviews;
    List<Salary> salaries;

    public Company(String employerName) {
        this.name = employerName;
    }

    public void addReview(Review review) {
        if (review == null) {
            return;
        }
        if (reviews == null) {
            reviews = new ArrayList<>();
        }
        reviews.add(review);
    }

    public void addSalary(Salary salary) {
        if (salary == null) {
            return;
        }
        if (salaries == null) {
            salaries = new ArrayList<>();
        }
        salaries.add(salary);
    }
}
