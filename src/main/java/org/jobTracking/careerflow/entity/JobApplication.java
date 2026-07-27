package org.jobTracking.careerflow.entity;
import org.jobTracking.careerflow.enums.ApplicationStatus;

public class JobApplication {
    private String JobTitle;
    private String companyName;
    private ApplicationStatus status;
    public JobApplication(String JobTitle,String companyName){
        this.JobTitle=JobTitle;
        this.companyName=companyName;
        this.status=ApplicationStatus.SAVED;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ApplicationStatus getStatus() {
        return status;
    }
    public void moveToStatus(ApplicationStatus target){
        if(status.canTransitionTo(target)){
            status=target;
            System.out.println("status changed to:"+status);
        }else{
            throw new IllegalStateException("cannot move from"+status+"to"+ target);
        }
    }
}
