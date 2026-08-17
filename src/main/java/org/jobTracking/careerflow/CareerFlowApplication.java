package org.jobTracking.careerflow;
import org.jobTracking.careerflow.service.JobApplicationService;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CareerFlowApplication {

    public static void main(String[] args) {

        var context=SpringApplication.run(CareerFlowApplication.class, args);
//        JobApplicationService service1=context.getBean(JobApplicationService.class);
//        JobApplicationService service2=context.getBean(JobApplicationService.class);
//        System.out.println(service1 == service2);
        JobApplicationService user1=context.getBean(JobApplicationService.class);
        user1.setLastSearchedCompany("Amazon");
        JobApplicationService user2=context.getBean(JobApplicationService.class);
        user2.setLastSearchedCompany("Google");
        System.out.println("User 1 searched :" + user1.getLastSearchedCompany());
        System.out.println("User 2 searched : " + user2.getLastSearchedCompany());
        System.out.println("User 1 Now sees:" + user1.getLastSearchedCompany());
    }

}
