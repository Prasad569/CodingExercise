package com.service;

import java.util.List;

import com.entities.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public boolean saveOrUpdate(Student student);
	
	public boolean deRegister(Student student);
	
}
