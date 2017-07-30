package com.srikanth.companyreview.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Company implements Parcelable {

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeList(this.reviews);
        dest.writeList(this.salaries);
    }

    protected Company(Parcel in) {
        this.name = in.readString();
        this.reviews = new ArrayList<Review>();
        in.readList(this.reviews, Review.class.getClassLoader());
        this.salaries = new ArrayList<Salary>();
        in.readList(this.salaries, Salary.class.getClassLoader());
    }

    public static final Parcelable.Creator<Company> CREATOR = new Parcelable.Creator<Company>() {
        @Override
        public Company createFromParcel(Parcel source) {
            return new Company(source);
        }

        @Override
        public Company[] newArray(int size) {
            return new Company[size];
        }
    };
}
