package org.jobTracking.careerflow.repository;

import org.jobTracking.careerflow.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository extends JpaRepository<JobApplication,Long>{
}
