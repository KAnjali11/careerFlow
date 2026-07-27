package org.jobTracking.careerflow.entity;
import org.jobTracking.careerflow.enums.ApplicationStatus;

public class TestRunner {

    public static void main(String[] args) {

        JobApplication application =
                new JobApplication("Java Developer", "TCS");

        application.moveToStatus(ApplicationStatus.APPLIED);

        application.moveToStatus(ApplicationStatus.RESUME_SHORTLISTED);

        application.moveToStatus(ApplicationStatus.INTERVIEW_SCHEDULED);

        application.moveToStatus(ApplicationStatus.TECHNICAL_ROUND);

        application.moveToStatus(ApplicationStatus.HR_ROUND);

        application.moveToStatus(ApplicationStatus.OFFER_RECEIVED);

        application.moveToStatus(ApplicationStatus.ACCEPTED);
    }
}
