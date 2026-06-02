package com.arpit.jobtracker.dto;

public class CoverLetterResponse {

    private Long applicationId;
    private String companyName;
    private String jobRole;
    private String coverLetter;

    public CoverLetterResponse(Long applicationId, String companyName, String jobRole, String coverLetter) {
        this.applicationId = applicationId;
        this.companyName = companyName;
        this.jobRole = jobRole;
        this.coverLetter = coverLetter;
    }

    public Long getApplicationId() { return applicationId; }
    public String getCompanyName() { return companyName; }
    public String getJobRole() { return jobRole; }
    public String getCoverLetter() { return coverLetter; }
}