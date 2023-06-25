package com.sae.admin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private long studentId;
	
	private String studentFullName;
	
	private String classStd;
}
