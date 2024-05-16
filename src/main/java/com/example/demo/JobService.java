package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.jobPost;



@Service
public class JobService {
	
	
	@Autowired
	public JobRepo Repo;
	
	public void addJob(jobPost JobPost)
	{
		Repo.addJob(JobPost);
	}

	
	public List<jobPost> getAllJobs()
	{
		return Repo.getAllJobs();
		
	}
}
