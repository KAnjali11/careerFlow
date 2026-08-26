package org.jobTracking.careerflow.controller;
import org.jobTracking.careerflow.entity.JobApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import  org.jobTracking.careerflow.service.JobApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @PostMapping
    public JobApplication create(@RequestBody JobApplication application){
        return jobApplicationService.create(application);
    }
    @GetMapping("/all")
    public List<JobApplication>getAll(){
        return jobApplicationService.getAll();
    }


}
