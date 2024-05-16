package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import model.jobPost;



@Controller
public class JobController {
	
	@Autowired
	private JobService service;

	
	@GetMapping({"/","home"})
	public String home()
	{
		
		return "home";
	}

	
	@GetMapping("addjob")
	public String addjob()
	{
		
		return "addjob";
	}
	
	@PostMapping("handleForm")
	public String handleForm(jobPost JobPost)
	{
		service.addJob(JobPost);
		return "success";
	}
	
	@GetMapping("viewalljobs")
	public String viewAllJobs(Model m)
	{
		List<jobPost> jobs = service.getAllJobs();
		m.addAttribute("jobPost", jobs);
		return "viewalljobs";
	}
}
