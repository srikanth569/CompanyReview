package com.srikanth.companyreview.model;


import org.json.JSONException;
import org.json.JSONObject;

public class Salary {

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
}
