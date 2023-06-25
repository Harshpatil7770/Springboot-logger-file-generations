package com.sae.admin.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sae.admin.model.Student;

@FeignClient(name="Student-Service",url = "http://localhost:7071/api/student")
public interface StudentServiceProxy {

	@GetMapping("/findAll")
	public List<Student> findAll();
}
