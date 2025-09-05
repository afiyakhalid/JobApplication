package com.code.store.job.impl;
import com.code.store.job.Job;
import com.code.store.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List   ;
@Service
public class JobServiceImplementation implements JobService {

    private List<Job> jobs=new ArrayList<>();
    private Long nextId=1L;//initializes the id to "1" if id is not specified"
    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        //sets the id to the job posted and increments itself to get added to another job posting
    jobs.add(job);
    }
}
