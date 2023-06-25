package com.sae.admin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sae.admin.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public List<Student> findAll() {

		List<Student> studentLists = new ArrayList<Student>(
				Arrays.asList(new Student(1, "AJOY SHETTY", "FIVE"), new Student(1, "SANJAY SINHANIYA", "FIVE")));
		return studentLists;
	}

}
