package org.jobTracking.careerflow.repository;
import org.jobTracking.careerflow.entity.JobApplication;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobApplicationRepository {
    private final List<JobApplication>applications= new ArrayList<>();
    public JobApplication save(JobApplication application){
        applications.add(application);
        return application;
    }
 public List<JobApplication> FindAll(){
        return applications;
 }
}
