package com.practice.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.student.feign.TeacherFeignClient;

@RestController
public class StudentController {

	@Autowired
	private TeacherFeignClient loadbalancer;
	
	@ResponseBody
	@RequestMapping(value = "/getStudents", method = {RequestMethod.GET}, produces = "application/json")
	public String getStudent() {
		return "All Students";
	}
	
	@ResponseBody
	@RequestMapping(value = "/getSomeStudents", method = {RequestMethod.GET}, produces = "application/json")
	public String getSomeStudents() {
		System.out.println(loadbalancer.getSomeTeachers());
		return "Some Students" + loadbalancer.getSomeTeachers();
	}
}
