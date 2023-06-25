package com.sae.admin.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sae.admin.model.Teacher;
import com.sae.admin.service.TeacherService;

@RestController
@RequestMapping("/api/teacher")
public class TeacherResource {

	@Autowired
	private TeacherService teacherService;

	@GetMapping("/findAll")
	public List<Teacher> findAll() {
		return teacherService.findAll();
	}
}
