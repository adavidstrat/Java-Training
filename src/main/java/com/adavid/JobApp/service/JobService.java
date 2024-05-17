package com.adavid.JobApp.service;

import com.adavid.JobApp.model.JobPost;
import com.adavid.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJobPost(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobPost() {
        return repo.getAllJobs();
    }

}
