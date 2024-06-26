package com.JobSafari.JobSafari.Service;

import com.JobSafari.JobSafari.Entity.RecruiterProfile;

import java.util.Optional;

public interface RecruiterProfileService {

    public Optional<RecruiterProfile> getOne(Integer id);

    public RecruiterProfile addNew(RecruiterProfile recruiterProfile);
}
