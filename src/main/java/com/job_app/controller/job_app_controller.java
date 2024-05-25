package com.job_app.controller;

import com.job_app.collection.JobPosts;

import com.job_app.service.jobappservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobapp")
@AllArgsConstructor
public class job_app_controller {

    private jobappservice servic;
    @GetMapping("/getallpost")
    public List<JobPosts> getAllPost(){
       return servic.getAllPost();
    }

    @PostMapping("/addnewpost")
    public String addNewPost(@RequestBody List<JobPosts> jobpost){
        return servic.addnewPost(jobpost);
    }

}
