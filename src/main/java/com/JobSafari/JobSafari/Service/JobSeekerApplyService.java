package com.JobSafari.JobSafari.Service;

import com.JobSafari.JobSafari.Entity.JobPostActivity;
import com.JobSafari.JobSafari.Entity.JobSeekerApply;
import com.JobSafari.JobSafari.Entity.JobSeekerProfile;

import java.util.List;

public interface JobSeekerApplyService {

    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId);

    public List<JobSeekerApply> getJobCandidates(JobPostActivity job);
}
