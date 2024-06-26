package com.JobSafari.JobSafari.Service;

import com.JobSafari.JobSafari.Entity.JobPostActivity;
import com.JobSafari.JobSafari.Entity.RecruiterJobsDto;

import java.time.LocalDate;
import java.util.List;

public interface JobPostActivityService {
    public JobPostActivity addNew(JobPostActivity jobPostActivity);

    public List<RecruiterJobsDto> getRecruiterJobs(int recruiter);

    public JobPostActivity getOne(int id);


    List<JobPostActivity> search(String job, String location, List<String> type, List<String> remote, LocalDate date);

    List<JobPostActivity> getAll();
}
