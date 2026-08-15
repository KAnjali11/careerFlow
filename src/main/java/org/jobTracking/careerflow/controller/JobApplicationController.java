package org.jobTracking.careerflow.controller;
import org.springframework.stereotype.Component;
import  org.jobTracking.careerflow.service.JobApplicationService;
@Component
public class JobApplicationController {
    private final JobApplicationService jobApplicationService;
    public JobApplicationController(JobApplicationService jobApplicationService){
        this.jobApplicationService=jobApplicationService;
    }

}
