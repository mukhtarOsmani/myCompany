package com.maoptech.MyCompany.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maoptech.MyCompany.models.Staff;

@Repository
public interface StaffRepositories extends JpaRepository<Staff, Long> {

}
