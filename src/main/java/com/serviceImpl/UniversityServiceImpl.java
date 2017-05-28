package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UniversityDao;
import com.entities.University;
import com.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService{

	@Autowired
	private UniversityDao universityDao;
	
	public List<University> getAllUniversities() {
	
		return universityDao.getAllUniversities();
	}

}
