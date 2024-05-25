package com.job_app.repostory;

import com.job_app.collection.JobPosts;

import java.util.List;

//repostory for serching the data according to given text
public interface serchingrepostory {
    public List<JobPosts> findAllPostByText(String text);
}
