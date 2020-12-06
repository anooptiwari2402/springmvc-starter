package com.tech.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.model.MyModel;
import com.tech.repo.MyRepo;

@RestController
public class MyController {

	private static final Logger logger = Logger.getLogger(MyController.class);
	
	@Autowired
	private MyRepo myRepo;
	
	@GetMapping("/test")
	public String getControllerTest() {
		return "OK";
	}
	
	@PostMapping("/postdata")
	public void postControllerData(@RequestBody MyModel myModel) {
		this.myRepo.save(myModel);
	}
	
	@GetMapping("/getdata")
	public List<MyModel> getControllerData(){
		return this.myRepo.findAll();
	}
}
