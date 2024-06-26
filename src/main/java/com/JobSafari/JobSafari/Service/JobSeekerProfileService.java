package com.JobSafari.JobSafari.Service;

import com.JobSafari.JobSafari.Entity.JobSeekerProfile;

import java.util.Optional;

public interface JobSeekerProfileService {
    public Optional<JobSeekerProfile> getOne(Integer id);

    public JobSeekerProfile addNew(JobSeekerProfile jobSeekerProfile);
}
