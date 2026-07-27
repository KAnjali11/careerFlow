package org.jobTracking.careerflow.enums;

public enum ApplicationStatus{
    SAVED,
    APPLIED,
    RESUME_SHORTLISTED,
    INTERVIEW_SCHEDULED,
    TECHNICAL_ROUND,
    HR_ROUND,
    OFFER_RECEIVED,
    ACCEPTED,
    REJECTED,
    WITHDRAWN;
 public boolean canTransitionTo(ApplicationStatus target) {
     if (isTerminal()) {
         return false;
     }
     switch (this) {
         case SAVED:
             return target==APPLIED;
         case APPLIED:
             return target==RESUME_SHORTLISTED;
         case RESUME_SHORTLISTED:
             return target==INTERVIEW_SCHEDULED;
         case INTERVIEW_SCHEDULED:
             return target==TECHNICAL_ROUND;
         case TECHNICAL_ROUND:
             return target==HR_ROUND;
         case HR_ROUND:
             return target==OFFER_RECEIVED;
         case OFFER_RECEIVED:
             return target==ACCEPTED;
         case ACCEPTED:
         case REJECTED:
         case WITHDRAWN:
             return false;
         default:
             return false;

     }
 }
    private boolean isTerminal() {
        return this == ACCEPTED || this == REJECTED || this == WITHDRAWN;
    }
}