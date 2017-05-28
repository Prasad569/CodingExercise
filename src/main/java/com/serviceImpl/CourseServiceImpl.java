package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CourseDao;
import com.entities.Course;
import com.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;

	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}

	public boolean saveOrUpdate(Course course) {
		return courseDao.saveOrUpdate(course);
	}

	public boolean delete(Course course) {
		return courseDao.delete(course);
	}
	


}
