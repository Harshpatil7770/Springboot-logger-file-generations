package com.sae.admin.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sae.admin.model.Student;
import com.sae.admin.model.Teacher;
import com.sae.admin.service.AdminService;
import com.sae.admin.service.AdminServiceImpl;

@RestController
@RequestMapping("/api/admin")
public class AdminResource {

	@Autowired
	private AdminService adminService;

	@GetMapping("/findAll-Student")
	public List<Student> getAllStudentsLists() {
		return adminService.findAll();
	}

	@GetMapping("/findAll-Teacher")
	public List<Teacher> getAllTeacherLists() {
		return adminService.findAllTeachersDetails();
	}

}
