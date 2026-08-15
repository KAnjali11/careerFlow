package org.jobTracking.careerflow.service;
import  org.springframework.stereotype.Service;
import org.jobTracking.careerflow.repository.JobApplicationRepository;
@Service
public class JobApplicationService {
    private final JobApplicationRepository jobApplicationRepository;
    public JobApplicationService (JobApplicationRepository jobApplicationRepository){
        this.jobApplicationRepository=jobApplicationRepository;

    }
}
