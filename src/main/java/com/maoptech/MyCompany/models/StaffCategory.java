package com.maoptech.MyCompany.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_staffCategory")
public class StaffCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "category_name")
	private String CategoryName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "staffcategory")
	private Set<Staff> staff;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public Set<Staff> getStaff() {
		return staff;
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

public StaffCategory() {
		
	}
	
	public StaffCategory(String categoryName, Set<Staff> staff) {
		super();
		CategoryName = categoryName;
		this.staff = staff;
	}

	

	
	
	
	
}
