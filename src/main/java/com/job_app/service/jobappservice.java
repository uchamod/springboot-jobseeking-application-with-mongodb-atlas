package com.job_app.service;

import com.job_app.collection.JobPosts;

import com.job_app.repostory.repostory;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

@AllArgsConstructor
public class jobappservice {


    private repostory repo;
    public   List<JobPosts> getAllPost() {
        List<JobPosts> jobs= repo.findAll();
        return jobs;
    }

    public String addnewPost(List<JobPosts> jobpost) {
        repo.saveAll(jobpost);
        return "post is added succsussfuly";
    }
}
