package com.job_app.controller;

import com.job_app.collection.JobPosts;

import com.job_app.service.jobappservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobapp")
@AllArgsConstructor
@CrossOrigin
public class job_app_controller {

    private jobappservice servic;

    //get all post from database
    @GetMapping("/getallpost")
    public List<JobPosts> getAllPost(){
       return servic.getAllPost();
    }
    //get post according to key word
    @GetMapping("/getallpostbytext/{text}")
    public List<JobPosts> findAllPostByText(@PathVariable String text){
        return servic.findAllPostByText(text);
    }

    //add a new job post
    @PostMapping("/addnewpost")
    public String addNewPost(@RequestBody List<JobPosts> jobpost){
        return servic.addnewPost(jobpost);
    }

}
