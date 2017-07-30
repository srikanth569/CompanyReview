package com.srikanth.companyreview.model;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private List<Review> reviews;
    private List<Salary> salaries;

    public Company(String employerName) {
        this.name = employerName;
        reviews = new ArrayList<>();
        salaries = new ArrayList<>();
    }

    public void addReview(Review review) {
        if (reviews == null) {
            reviews = new ArrayList<>();
        }
        reviews.add(review);
    }

    public void addSalary(Salary salary) {
        if (salaries == null) {
            salaries = new ArrayList<>();
        }
        salaries.add(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }
}
