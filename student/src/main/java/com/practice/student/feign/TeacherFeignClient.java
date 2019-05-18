package com.practice.student.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="teacher-service")
public interface TeacherFeignClient {

	@RequestMapping(method= {RequestMethod.GET},value="/someTeachers")
	public String getSomeTeachers();
}
