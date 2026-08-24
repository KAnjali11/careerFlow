package org.jobTracking.careerflow.controller;
import org.springframework.stereotype.Component;
import  org.jobTracking.careerflow.service.JobApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applications")
public class JobApplicationController {
    private final JobApplicationService jobApplicationService;
    public JobApplicationController(JobApplicationService jobApplicationService){
        this.jobApplicationService=jobApplicationService;
    }
    @GetMapping
    public String test(){
        return "Job Application Controller is working";
    }

}
