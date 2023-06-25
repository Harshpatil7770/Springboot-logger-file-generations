package com.sae.admin.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sae.admin.model.Student;
import com.sae.admin.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentResource {

	@Autowired
	public StudentService studentService;

	@GetMapping("/findAll")
	public List<Student> findAll() {

		return studentService.findAll();
	}
}
