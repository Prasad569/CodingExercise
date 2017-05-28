package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.entities.Student;
import com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;

	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
	
	public boolean saveOrUpdate(Student student){
	    
	        return studentDao.saveOrUpdate(student);
	    

	}

	public boolean deRegister(Student student) {
		return studentDao.deRegister(student);
	}

}
