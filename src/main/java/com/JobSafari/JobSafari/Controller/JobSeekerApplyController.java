package com.JobSafari.JobSafari.Controller;

import com.JobSafari.JobSafari.Entity.JobPostActivity;
import com.JobSafari.JobSafari.Service.JobPostActivityServiceImpl;
import com.JobSafari.JobSafari.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class JobSeekerApplyController {

    @Autowired
    private final JobPostActivityServiceImpl jobPostActivityService;
    private final UserServiceImpl userService;

    public JobSeekerApplyController(JobPostActivityServiceImpl jobPostActivityService, UserServiceImpl userService) {
        this.jobPostActivityService = jobPostActivityService;
        this.userService = userService;
    }

    @GetMapping("job-details-apply/{id}")
    public String display(@PathVariable("id") int id, Model model){
        JobPostActivity jobDetails = jobPostActivityService.getOne(id);
        model.addAttribute("jobDetails", jobDetails);
        model.addAttribute("user", userService.getCurrentUserProfile());
        return "job-details";
    }
}
