package com.dao;

import java.util.List;

import com.entities.Student;

public interface StudentDao {

	public List<Student> getAllStudents();
	
	public boolean saveOrUpdate(Student student);
	
	public boolean deRegister(Student student);
	
}
