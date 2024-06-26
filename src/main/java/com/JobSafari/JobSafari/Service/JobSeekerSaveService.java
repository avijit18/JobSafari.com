package com.JobSafari.JobSafari.Service;

import com.JobSafari.JobSafari.Entity.JobPostActivity;
import com.JobSafari.JobSafari.Entity.JobSeekerProfile;
import com.JobSafari.JobSafari.Entity.JobSeekerSave;

import java.util.List;

public interface JobSeekerSaveService {

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId);

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job);
}
