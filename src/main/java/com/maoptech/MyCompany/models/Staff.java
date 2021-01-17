package com.maoptech.MyCompany.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email_id")
	private String emailID;
	
	
	@ManyToOne
	@JoinColumn(name ="category_id", nullable = false)
	private StaffCategory staffcategory;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


//	public StaffCategory getStaffcategory() {
//		return staffcategory;
//	}
//
//
//	public void setStaffcategory(StaffCategory staffcategory) {
//		this.staffcategory = staffcategory;
//	}

	
	public Staff() {
		
	}


	public Staff(String firstName, String lastName, String emailID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
//		this.staffcategory = staffcategory;
	}

//	, StaffCategory staffcategory
	
	
	
	
	
}
