package com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.entities.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{

    @Autowired
    SessionFactory session;
	
	public List<Student> getAllStudents() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

	public boolean saveOrUpdate(Student student) {
		 session.getCurrentSession().saveOrUpdate(student);
	     return true;
	}

	public boolean deRegister(Student student) {
		try {
            session.getCurrentSession().delete(student);
        } catch (Exception ex) {
            return false;
        }
 
        return true;
	}

	
	
}
