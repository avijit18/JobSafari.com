package com.JobSafari.JobSafari.Repository;

import com.JobSafari.JobSafari.Entity.JobPostActivity;
import com.JobSafari.JobSafari.Entity.JobSeekerProfile;
import com.JobSafari.JobSafari.Entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);
}
