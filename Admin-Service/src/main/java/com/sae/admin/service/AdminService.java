package com.sae.admin.service;

import java.util.List;

import com.sae.admin.model.Student;
import com.sae.admin.model.Teacher;

public interface AdminService {

	public List<Student> findAll();
	
	public List<Teacher> findAllTeachersDetails();
}
