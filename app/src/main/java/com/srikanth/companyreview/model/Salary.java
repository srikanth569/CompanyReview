package com.srikanth.companyreview.model;


import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONException;
import org.json.JSONObject;

public class Salary implements Parcelable {

    private String employerName;
    private String employmentStatus;

    private String attributionURL;
    private BasePay basePay;
    private Integer employerId;


    private Integer id;
    private String jobTitle;
    private String location;
    private BasePay meanBasePay;
    private String payDeltaLocationType;
    private Double payDeltaPercent;
    private String payPeriod;
    private String reviewDateTime;
    private String sqLogoUrl;

    public Salary loadFromJson(JSONObject obj) throws JSONException {
        Salary salary = new Salary();
        salary.setEmployerName(obj.getString("employerName"));
        salary.setEmploymentStatus(obj.getString("employmentStatus"));
        salary.setJobTitle(obj.getString("jobTitle"));
        salary.setBasePay(new BasePay().loadFromJson(obj.getJSONObject("basePay")));
        salary.setMeanBasePay(new BasePay().loadFromJson(obj.getJSONObject("meanBasePay")));
        salary.setLocation(obj.getString("location"));
        salary.setReviewDateTime(obj.getString("reviewDateTime"));
        return salary;
    }

    public String getAttributionURL() {
        return attributionURL;
    }

    public void setAttributionURL(String attributionURL) {
        this.attributionURL = attributionURL;
    }

    public BasePay getBasePay() {
        return basePay;
    }

    public void setBasePay(BasePay basePay) {
        this.basePay = basePay;
    }

    public Integer getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Integer employerId) {
        this.employerId = employerId;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BasePay getMeanBasePay() {
        return meanBasePay;
    }

    public void setMeanBasePay(BasePay meanBasePay) {
        this.meanBasePay = meanBasePay;
    }

    public String getPayDeltaLocationType() {
        return payDeltaLocationType;
    }

    public void setPayDeltaLocationType(String payDeltaLocationType) {
        this.payDeltaLocationType = payDeltaLocationType;
    }

    public Double getPayDeltaPercent() {
        return payDeltaPercent;
    }

    public void setPayDeltaPercent(Double payDeltaPercent) {
        this.payDeltaPercent = payDeltaPercent;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    }

    public String getReviewDateTime() {
        return reviewDateTime;
    }

    public void setReviewDateTime(String reviewDateTime) {
        this.reviewDateTime = reviewDateTime;
    }

    public String getSqLogoUrl() {
        return sqLogoUrl;
    }

    public void setSqLogoUrl(String sqLogoUrl) {
        this.sqLogoUrl = sqLogoUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.employerName);
        dest.writeString(this.employmentStatus);
        dest.writeString(this.attributionURL);
        dest.writeParcelable(this.basePay, flags);
        dest.writeValue(this.employerId);
        dest.writeValue(this.id);
        dest.writeString(this.jobTitle);
        dest.writeString(this.location);
        dest.writeParcelable(this.meanBasePay, flags);
        dest.writeString(this.payDeltaLocationType);
        dest.writeValue(this.payDeltaPercent);
        dest.writeString(this.payPeriod);
        dest.writeString(this.reviewDateTime);
        dest.writeString(this.sqLogoUrl);
    }

    public Salary() {
    }

    protected Salary(Parcel in) {
        this.employerName = in.readString();
        this.employmentStatus = in.readString();
        this.attributionURL = in.readString();
        this.basePay = in.readParcelable(BasePay.class.getClassLoader());
        this.employerId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.jobTitle = in.readString();
        this.location = in.readString();
        this.meanBasePay = in.readParcelable(BasePay.class.getClassLoader());
        this.payDeltaLocationType = in.readString();
        this.payDeltaPercent = (Double) in.readValue(Double.class.getClassLoader());
        this.payPeriod = in.readString();
        this.reviewDateTime = in.readString();
        this.sqLogoUrl = in.readString();
    }

    public static final Parcelable.Creator<Salary> CREATOR = new Parcelable.Creator<Salary>() {
        @Override
        public Salary createFromParcel(Parcel source) {
            return new Salary(source);
        }

        @Override
        public Salary[] newArray(int size) {
            return new Salary[size];
        }
    };
}
