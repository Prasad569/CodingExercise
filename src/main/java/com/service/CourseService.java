package com.service;

import java.util.List;

import com.entities.Course;

public interface CourseService {

	public List<Course> getAllCourses();
	
	public boolean saveOrUpdate(Course course);
	
	public boolean delete(Course course);

}
