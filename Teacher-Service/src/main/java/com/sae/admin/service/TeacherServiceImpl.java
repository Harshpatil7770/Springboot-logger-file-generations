package com.sae.admin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sae.admin.model.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Override
	public List<Teacher> findAll() {
		List<Teacher> teachers = new ArrayList<Teacher>(
				Arrays.asList(new Teacher(1, "KALPIT SHARMA"), new Teacher(2, "RANMANATH KOVIND")));
		return teachers;
	}

}
