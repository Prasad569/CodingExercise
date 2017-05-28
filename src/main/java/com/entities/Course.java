package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course_Details")
public class Course {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
	private Integer id;
	
	@Column(name = "course_name")
	private String universityName;
	
	@Column(name = "course_university")
	private String courseUniversity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getCourseUniversity() {
		return courseUniversity;
	}

	public void setCourseUniversity(String courseUniversity) {
		this.courseUniversity = courseUniversity;
	}

	
	
	
}
