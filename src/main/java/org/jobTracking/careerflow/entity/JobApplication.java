package org.jobTracking.careerflow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.jobTracking.careerflow.enums.ApplicationStatus;

@Entity
@Table(name = "job_applications")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String jobTitle;
    private String companyName;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    public JobApplication() {

    }

    public JobApplication(String jobTitle, String companyName) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.status = ApplicationStatus.SAVED;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void moveToStatus(ApplicationStatus target) {
        if (status.canTransitionTo(target)) {
            status = target;
            System.out.println("status changed to:" + status);
        } else {
            throw new IllegalStateException(
                    "cannot move from" + status + "to" + target
            );
        }
    }
}