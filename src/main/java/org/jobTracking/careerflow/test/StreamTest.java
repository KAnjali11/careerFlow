package org.jobTracking.careerflow.test;
import org.jobTracking.careerflow.entity.JobApplication;
import org.jobTracking.careerflow.enums.ApplicationStatus;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
public class StreamTest {
    public static void main(String[] args){
        JobApplication app1=new JobApplication("Java Developer","TCS");
        JobApplication app2=new JobApplication("Backend Developer","Infosys");
        JobApplication app3=new JobApplication("Software Engineer","Amazon");
        JobApplication app4=new JobApplication("SpringBoot Developer","TCS");
        JobApplication app5=new JobApplication("FullStack Developer","Infosys");
        app1.moveToStatus(ApplicationStatus.APPLIED);
        app2.moveToStatus(ApplicationStatus.APPLIED);
        app2.moveToStatus(ApplicationStatus.RESUME_SHORTLISTED);
        app3.moveToStatus(ApplicationStatus.APPLIED);
        app4.moveToStatus(ApplicationStatus.APPLIED);
        app4.moveToStatus(ApplicationStatus.RESUME_SHORTLISTED);
        app4.moveToStatus(ApplicationStatus.INTERVIEW_SCHEDULED);
        app5.moveToStatus(ApplicationStatus.APPLIED);
        List <JobApplication> applications=List.of(app1,app2,app3,app4,app5);
        applications.stream()
                .filter(app -> app.getStatus() == ApplicationStatus.APPLIED)
                .map(JobApplication::getJobTitle)
                .forEach(System.out::println);
        applications.stream()
                .collect(Collectors.groupingBy(
                        JobApplication::getCompanyName
                ));
        Map<String,List<JobApplication>>groupedApplications=
                applications.stream().collect(Collectors.groupingBy(
                        JobApplication::getCompanyName));
//        System.out.println(groupedApplications);
        groupedApplications.forEach((company,apps)->{
            System.out.println(company + ":");
            apps.forEach(app->
                    System.out.println("-"+app.getJobTitle())
            );
        });
        applications.stream();
                Collectors.groupingBy(JobApplication::getStatus,
                Collectors.counting());
                Map<ApplicationStatus,Long>statusCounts=applications.stream()
                        .collect(
                                Collectors.groupingBy(JobApplication::getStatus,
                                        Collectors.counting())
                        );
                System.out.println(statusCounts);
    }
}
