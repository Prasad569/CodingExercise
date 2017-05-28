package com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UniversityDao;
import com.entities.University;

@Repository
@Transactional
public class UniversityDaoImpl implements UniversityDao{

    @Autowired
    SessionFactory session;

	public List<University> getAllUniversities() {

		return session.getCurrentSession().createQuery("from University").list();
		
	}

	
}
