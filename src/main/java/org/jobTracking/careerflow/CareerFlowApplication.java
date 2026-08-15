package org.jobTracking.careerflow;
import org.jobTracking.careerflow.service.JobApplicationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CareerFlowApplication {

    public static void main(String[] args) {

        var context=SpringApplication.run(CareerFlowApplication.class, args);
        JobApplicationService service1=context.getBean(JobApplicationService.class);
        JobApplicationService service2=context.getBean(JobApplicationService.class);
        System.out.println(service1 == service2);
    }

}
