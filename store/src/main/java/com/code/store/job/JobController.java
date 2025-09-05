package com.code.store.job;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


import java.util.ArrayList;

@RestController
public class JobController {
 private JobService jobservice;

    public JobController(JobService jobservice) {
        this.jobservice = jobservice;
    }

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobservice.findAll();
    }
    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){

                jobservice.createJob(job);
                return "job added succesfully";
    }
}
