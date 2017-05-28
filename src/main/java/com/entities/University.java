package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "University_Details")
public class University {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "university_id")
	private Integer id;
	
	@Column(name = "university_name")
	private String universityName;
	
	@Column(name = "university_country")
	private String universityCountry;

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

	public String getUniversityCountry() {
		return universityCountry;
	}

	public void setUniversityCountry(String universityCountry) {
		this.universityCountry = universityCountry;
	}
	
	
	
}
