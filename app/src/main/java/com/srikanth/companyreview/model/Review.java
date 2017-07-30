package com.srikanth.companyreview.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Review {
    private String pros;
    private String advice;
    private String cons;

    private String jobTitle;
    private String headline;
    private Double overallNumeric;

    private String approvalStatus;
    private String attributionURL;
    private Double careerOpportunitiesRating;
    private String ceoApproval;
    private Double ceoRating;
    private Double compensationAndBenefitsRating;

    private Double cultureAndValuesRating;
    private Boolean currentJob;
    private Integer employerId;
    private String employerName;
    private Object employerResponse;
    private String employmentStatus;
    private Boolean featuredReview;

    private Integer helpfulCount;
    private Integer id;
    private Object jobInformation;

    private String jobTitleFromDb;
    private String lengthOfEmployment;
    private String location;
    private Boolean newReview;
    private Integer notHelpfulCount;
    private String overall;

    private Boolean recommendToFriend;
    private String reviewDateTime;
    private Double seniorLeadershipRating;
    private String sqLogoUrl;
    private Integer totalHelpfulCount;
    private Double workLifeBalanceRating;


    public Review loadFromJson(JSONObject json) throws JSONException {
        Review review = new Review();
        review.setAdvice(json.getString("advice"));
        review.setPros(json.getString("pros"));
        review.setCons(json.getString("cons"));
        review.setJobTitle(json.getString("jobTitle"));
        review.setHeadline(json.getString("headline"));
        review.setOverallNumeric(json.getDouble("overallNumeric"));
        review.setEmployerName(json.getString("employerName"));
        review.setReviewDateTime(json.getString("reviewDateTime"));
        return review;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getAttributionURL() {
        return attributionURL;
    }

    public void setAttributionURL(String attributionURL) {
        this.attributionURL = attributionURL;
    }

    public Double getCareerOpportunitiesRating() {
        return careerOpportunitiesRating;
    }

    public void setCareerOpportunitiesRating(Double careerOpportunitiesRating) {
        this.careerOpportunitiesRating = careerOpportunitiesRating;
    }

    public String getCeoApproval() {
        return ceoApproval;
    }

    public void setCeoApproval(String ceoApproval) {
        this.ceoApproval = ceoApproval;
    }

    public Double getCeoRating() {
        return ceoRating;
    }

    public void setCeoRating(Double ceoRating) {
        this.ceoRating = ceoRating;
    }

    public Double getCompensationAndBenefitsRating() {
        return compensationAndBenefitsRating;
    }

    public void setCompensationAndBenefitsRating(Double compensationAndBenefitsRating) {
        this.compensationAndBenefitsRating = compensationAndBenefitsRating;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    public Double getCultureAndValuesRating() {
        return cultureAndValuesRating;
    }

    public void setCultureAndValuesRating(Double cultureAndValuesRating) {
        this.cultureAndValuesRating = cultureAndValuesRating;
    }

    public Boolean getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(Boolean currentJob) {
        this.currentJob = currentJob;
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

    public Object getEmployerResponse() {
        return employerResponse;
    }

    public void setEmployerResponse(Object employerResponse) {
        this.employerResponse = employerResponse;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Boolean getFeaturedReview() {
        return featuredReview;
    }

    public void setFeaturedReview(Boolean featuredReview) {
        this.featuredReview = featuredReview;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Integer getHelpfulCount() {
        return helpfulCount;
    }

    public void setHelpfulCount(Integer helpfulCount) {
        this.helpfulCount = helpfulCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getJobInformation() {
        return jobInformation;
    }

    public void setJobInformation(Object jobInformation) {
        this.jobInformation = jobInformation;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitleFromDb() {
        return jobTitleFromDb;
    }

    public void setJobTitleFromDb(String jobTitleFromDb) {
        this.jobTitleFromDb = jobTitleFromDb;
    }

    public String getLengthOfEmployment() {
        return lengthOfEmployment;
    }

    public void setLengthOfEmployment(String lengthOfEmployment) {
        this.lengthOfEmployment = lengthOfEmployment;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getNewReview() {
        return newReview;
    }

    public void setNewReview(Boolean newReview) {
        this.newReview = newReview;
    }

    public Integer getNotHelpfulCount() {
        return notHelpfulCount;
    }

    public void setNotHelpfulCount(Integer notHelpfulCount) {
        this.notHelpfulCount = notHelpfulCount;
    }

    public String getOverall() {
        return overall;
    }

    public void setOverall(String overall) {
        this.overall = overall;
    }

    public Double getOverallNumeric() {
        return overallNumeric;
    }

    public void setOverallNumeric(Double overallNumeric) {
        this.overallNumeric = overallNumeric;
    }

    public String getPros() {
        return pros;
    }

    public void setPros(String pros) {
        this.pros = pros;
    }

    public Boolean getRecommendToFriend() {
        return recommendToFriend;
    }

    public void setRecommendToFriend(Boolean recommendToFriend) {
        this.recommendToFriend = recommendToFriend;
    }

    public String getReviewDateTime() {
        return reviewDateTime;
    }

    public void setReviewDateTime(String reviewDateTime) {
        this.reviewDateTime = reviewDateTime;
    }

    public Double getSeniorLeadershipRating() {
        return seniorLeadershipRating;
    }

    public void setSeniorLeadershipRating(Double seniorLeadershipRating) {
        this.seniorLeadershipRating = seniorLeadershipRating;
    }

    public String getSqLogoUrl() {
        return sqLogoUrl;
    }

    public void setSqLogoUrl(String sqLogoUrl) {
        this.sqLogoUrl = sqLogoUrl;
    }

    public Integer getTotalHelpfulCount() {
        return totalHelpfulCount;
    }

    public void setTotalHelpfulCount(Integer totalHelpfulCount) {
        this.totalHelpfulCount = totalHelpfulCount;
    }

    public Double getWorkLifeBalanceRating() {
        return workLifeBalanceRating;
    }

    public void setWorkLifeBalanceRating(Double workLifeBalanceRating) {
        this.workLifeBalanceRating = workLifeBalanceRating;
    }
}


