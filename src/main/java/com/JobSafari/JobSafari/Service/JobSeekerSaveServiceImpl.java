package com.JobSafari.JobSafari.Service;

import com.JobSafari.JobSafari.Entity.JobPostActivity;
import com.JobSafari.JobSafari.Entity.JobSeekerProfile;
import com.JobSafari.JobSafari.Entity.JobSeekerSave;
import com.JobSafari.JobSafari.Repository.JobSeekerSaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerSaveServiceImpl implements JobSeekerSaveService{

    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public JobSeekerSaveServiceImpl(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    @Override
    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    @Override
    public List<JobSeekerSave> getJobCandidates(JobPostActivity job) {
        return jobSeekerSaveRepository.findByJob(job);
    }
}
