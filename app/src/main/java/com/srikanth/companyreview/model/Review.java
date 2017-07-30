package com.srikanth.companyreview.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONException;
import org.json.JSONObject;

public class Review implements Parcelable {
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
    private String employmentStatus;
    private Boolean featuredReview;

    private Integer helpfulCount;
    private Integer id;

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.pros);
        dest.writeString(this.advice);
        dest.writeString(this.cons);
        dest.writeString(this.jobTitle);
        dest.writeString(this.headline);
        dest.writeValue(this.overallNumeric);
        dest.writeString(this.approvalStatus);
        dest.writeString(this.attributionURL);
        dest.writeValue(this.careerOpportunitiesRating);
        dest.writeString(this.ceoApproval);
        dest.writeValue(this.ceoRating);
        dest.writeValue(this.compensationAndBenefitsRating);
        dest.writeValue(this.cultureAndValuesRating);
        dest.writeValue(this.currentJob);
        dest.writeValue(this.employerId);
        dest.writeString(this.employerName);
        dest.writeString(this.employmentStatus);
        dest.writeValue(this.featuredReview);
        dest.writeValue(this.helpfulCount);
        dest.writeValue(this.id);
        dest.writeString(this.jobTitleFromDb);
        dest.writeString(this.lengthOfEmployment);
        dest.writeString(this.location);
        dest.writeValue(this.newReview);
        dest.writeValue(this.notHelpfulCount);
        dest.writeString(this.overall);
        dest.writeValue(this.recommendToFriend);
        dest.writeString(this.reviewDateTime);
        dest.writeValue(this.seniorLeadershipRating);
        dest.writeString(this.sqLogoUrl);
        dest.writeValue(this.totalHelpfulCount);
        dest.writeValue(this.workLifeBalanceRating);
    }

    public Review() {
    }

    protected Review(Parcel in) {
        this.pros = in.readString();
        this.advice = in.readString();
        this.cons = in.readString();
        this.jobTitle = in.readString();
        this.headline = in.readString();
        this.overallNumeric = (Double) in.readValue(Double.class.getClassLoader());
        this.approvalStatus = in.readString();
        this.attributionURL = in.readString();
        this.careerOpportunitiesRating = (Double) in.readValue(Double.class.getClassLoader());
        this.ceoApproval = in.readString();
        this.ceoRating = (Double) in.readValue(Double.class.getClassLoader());
        this.compensationAndBenefitsRating = (Double) in.readValue(Double.class.getClassLoader());
        this.cultureAndValuesRating = (Double) in.readValue(Double.class.getClassLoader());
        this.currentJob = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.employerId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.employerName = in.readString();
        this.employmentStatus = in.readString();
        this.featuredReview = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.helpfulCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.jobTitleFromDb = in.readString();
        this.lengthOfEmployment = in.readString();
        this.location = in.readString();
        this.newReview = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.notHelpfulCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.overall = in.readString();
        this.recommendToFriend = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.reviewDateTime = in.readString();
        this.seniorLeadershipRating = (Double) in.readValue(Double.class.getClassLoader());
        this.sqLogoUrl = in.readString();
        this.totalHelpfulCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.workLifeBalanceRating = (Double) in.readValue(Double.class.getClassLoader());
    }

    public static final Parcelable.Creator<Review> CREATOR = new Parcelable.Creator<Review>() {
        @Override
        public Review createFromParcel(Parcel source) {
            return new Review(source);
        }

        @Override
        public Review[] newArray(int size) {
            return new Review[size];
        }
    };
}


