package com.csu.ohio.student.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csu.ohio.student.bean.SemesterBean;
import com.csu.ohio.student.service.SemesterService;

@RestController
public class SemesterController {

	private static final Logger logger = LoggerFactory.getLogger(SemesterController.class);
	
	/*
	 * Autowire the VendorService object
	 * 
	 * */
	@Autowired
	SemesterService semesterService;
	// Your Code Here
	
	@GetMapping("/")
	public String index() {
		return "Welcome to Spring Boot Semester Service API!";
	}

	
	/* 
	 * Method - getSemesterDetails()
	 * Fetch all the semester details using SemesterService and store it inside a List
	 * Return a ResponseEntity object passing the list of semester details
	 * 
	 */
	
	@GetMapping("/semester/controller/getSemesters")
	public ResponseEntity<List<SemesterBean>> getSemesterDetails() {
		// Your Code Here
		List<SemesterBean> list=semesterService.getSemesterDetails();
		return new ResponseEntity<List<SemesterBean>>(list, HttpStatus.OK);		
	}
}
