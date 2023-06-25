package com.sae.admin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sae.admin.model.Student;
import com.sae.admin.model.Teacher;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdminServiceImpl implements AdminService {

	@Autowired
	StudentServiceProxy studentServiceProxy;

	@Autowired
	TeacherServiceProxy teacherServiceProxy;

	@Autowired

	@Override
	@CircuitBreaker(name = "studentServiceCircuitBreaker", fallbackMethod = "studentServiceFallbackMethod")
	public List<Student> findAll() {
		return studentServiceProxy.findAll();
	}

	// Never forget to parameter as Exception e
	public List<Student> studentServiceFallbackMethod(Exception e) {
		log.info("Student-Service Fallback method get executed .... ");
		return new ArrayList<Student>(Arrays.asList(new Student(1l, "DummyData", "DummyData")));
	}

	@Override
	@CircuitBreaker(name = "teacherServiceCircuitBreaker", fallbackMethod = "teacherServiceFallbackMethod")
	public List<Teacher> findAllTeachersDetails() {
		return teacherServiceProxy.findAll();
	}

	public List<Teacher> teacherServiceFallbackMethod(Exception e) {
		log.info("Executing teacherServiceFallbackMethod due to some fail over - {} ", e.getMessage());
		return new ArrayList<Teacher>(Arrays.asList(new Teacher(1l, "DummyData")));
	}
}
