package com.job_app.service;

import com.job_app.collection.JobPosts;

import com.job_app.repostory.repostory;


import com.job_app.repostory.serchingrepostory;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service


public class jobappservice {

    @Autowired
    private repostory repo;

    @Autowired
    private serchingrepostory serchrepo;

    //fetch all the post from db
    public List<JobPosts> getAllPost() {
        List<JobPosts> jobs = repo.findAll();
        return jobs;
    }

    //add new post to db
    public String addnewPost(List<JobPosts> jobpost) {
        repo.saveAll(jobpost);
        return "post is added succsussfuly";
    }

    public List<JobPosts> findAllPostByText(String text) {
        return serchrepo.findAllPostByText(text);



    }
}
