package com.job_app.repostory;

import com.job_app.collection.JobPosts;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface repostory extends MongoRepository<JobPosts,String> {


}
