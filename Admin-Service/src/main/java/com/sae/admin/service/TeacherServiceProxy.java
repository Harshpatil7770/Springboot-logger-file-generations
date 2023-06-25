package com.sae.admin.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sae.admin.model.Teacher;

@FeignClient(name = "Teacher-Service", url = "http://localhost:7072/api/teacher")
public interface TeacherServiceProxy {

	@GetMapping("/findAll")
	public List<Teacher> findAll();
}
