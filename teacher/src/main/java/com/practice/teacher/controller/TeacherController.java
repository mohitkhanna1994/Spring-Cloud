package com.practice.teacher.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	@ResponseBody
	@RequestMapping(value = "/getTeachers", method = { RequestMethod.GET }, produces = "application/json")
	public String getAllTeachers() {
		return "All Teachers";
	}
	
	@ResponseBody
	@RequestMapping(value = "/someTeachers", method = {RequestMethod.GET }, produces ="application/json")
	public String getSomeTeachers() {
		return "some Teachers";
	}
}
