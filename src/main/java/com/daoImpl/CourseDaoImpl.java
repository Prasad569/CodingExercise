package com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CourseDao;
import com.entities.Course;


@Repository
@Transactional
public class CourseDaoImpl implements CourseDao{

    @Autowired
    SessionFactory session;

	public List<Course> getAllCourses() {
		return session.getCurrentSession().createQuery("from Course").list();
	}

	public boolean saveOrUpdate(Course course) {
		 session.getCurrentSession().saveOrUpdate(course);
	     return true;
	}

	public boolean delete(Course course) {
		try {
            session.getCurrentSession().delete(course);
        } catch (Exception ex) {
            return false;
        }
 
        return true;
	}



}
