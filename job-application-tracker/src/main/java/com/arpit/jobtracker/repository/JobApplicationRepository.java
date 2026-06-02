package com.arpit.jobtracker.repository;

import com.arpit.jobtracker.model.JobApplication;
import com.arpit.jobtracker.model.JobApplication.ApplicationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
    List<JobApplication> findByStatus(ApplicationStatus status);
    List<JobApplication> findByCompanyNameContainingIgnoreCase(String companyName);
}