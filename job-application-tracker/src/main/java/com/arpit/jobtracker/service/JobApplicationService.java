package com.arpit.jobtracker.service;

import com.arpit.jobtracker.dto.CoverLetterResponse;
import com.arpit.jobtracker.model.JobApplication;
import com.arpit.jobtracker.model.JobApplication.ApplicationStatus;
import com.arpit.jobtracker.repository.JobApplicationRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class JobApplicationService {

    private final JobApplicationRepository repository;

    public JobApplicationService(JobApplicationRepository repository) {
        this.repository = repository;
    }

    public JobApplication save(JobApplication application) {
        return repository.save(application);
    }

    @Cacheable(value = "applications")
    public List<JobApplication> getAll() {
        return repository.findAll();
    }

    @Cacheable(value = "application", key = "#id")
    public JobApplication getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found with id: " + id));
    }

    public List<JobApplication> getByStatus(ApplicationStatus status) {
        return repository.findByStatus(status);
    }

    @CacheEvict(value = {"applications", "application"}, allEntries = true)
    public JobApplication updateStatus(Long id, ApplicationStatus status) {
        JobApplication application = getById(id);
        application.setStatus(status);
        return repository.save(application);
    }

    @CacheEvict(value = {"applications", "application"}, allEntries = true)
    public void delete(Long id) {
        repository.deleteById(id);
    }
}