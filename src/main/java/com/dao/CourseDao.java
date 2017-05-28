package com.dao;

import java.util.List;

import com.entities.Course;

public interface CourseDao {

	public List<Course> getAllCourses();
	
	public boolean saveOrUpdate(Course course);
	
	public boolean delete(Course course);

}
