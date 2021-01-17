package com.maoptech.MyCompany.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maoptech.MyCompany.models.Staff;
import com.maoptech.MyCompany.respositories.StaffRepositories;

@RestController
@RequestMapping("/api/v1/")
public class StaffController {
	
	@Autowired
	private StaffRepositories staffrespository;
	
	@CrossOrigin
	@GetMapping("/staff")
	private List<Staff> getStaffList()
	{
		return staffrespository.findAll();
	}
	
	@CrossOrigin
	@PostMapping("/staff")
	public Staff createStaff(@RequestBody Staff staff)
	{
		return staffrespository.save(staff);
	}

}
