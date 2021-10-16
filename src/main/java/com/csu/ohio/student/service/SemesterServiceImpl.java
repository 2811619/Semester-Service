package com.csu.ohio.student.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csu.ohio.student.bean.SemesterBean;
import com.csu.ohio.student.dao.SemesterDAO;
import com.csu.ohio.student.entity.SemesterEntity;

@Service
public class SemesterServiceImpl implements SemesterService{

	private static final Logger logger = LoggerFactory.getLogger(SemesterServiceImpl.class);
	
	/*
	 * Autowire SemesterDAO object
	 * 
	 * */
	@Autowired
	private SemesterDAO semesterdao;
	
	// Your Code Here

	
	/*
	 * Method - getSemesterDetails()
	 * Use the SemesterDAO to get all the semester
	 * Check if semester is not empty then 
	 * 		Declare SemesterBean object with null value
	 * 		Loop through all the semesters 
	 * 			Create a new bean object 
	 * 			Copy each property value of entity object to bean object
	 * 			Add the bean object to the semesterBeans list
	 * */

	@Override
	public List<SemesterBean> getSemesterDetails() 
	{
		List<SemesterBean> semesterBeans =null;
			List<SemesterEntity> list=semesterdao.findAll();
		if(!list.isEmpty()) {
			 semesterBeans=new ArrayList<SemesterBean>();
			for(SemesterEntity en:list) {
				SemesterBean semesterBeans1=new SemesterBean();
				BeanUtils.copyProperties(en, semesterBeans1);
				semesterBeans.add(semesterBeans1);
				
			}
		}
		return semesterBeans;
		
	}
	

}
