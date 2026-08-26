package org.jobTracking.careerflow.service;
import org.jobTracking.careerflow.entity.JobApplication;
import  org.springframework.stereotype.Service;
import org.jobTracking.careerflow.repository.JobApplicationRepository;
import java.util.List;
@Service
public class JobApplicationService {

    private String lastSearchedCompany;
    private final JobApplicationRepository jobApplicationRepository;
    public JobApplicationService (JobApplicationRepository jobApplicationRepository){
        this.jobApplicationRepository=jobApplicationRepository;

    }

    public void setLastSearchedCompany(String lastSearchedCompany) {
        this.lastSearchedCompany = lastSearchedCompany;
    }
    public String getLastSearchedCompany(){
        return lastSearchedCompany;
    }
    public JobApplication create(JobApplication application){
        return jobApplicationRepository.save(application);
    }
    public List<JobApplication>getAll(){
        return jobApplicationRepository.FindAll();
    }
}
