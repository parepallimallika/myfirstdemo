package com.family.member.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.member.model.Employee;
import com.family.member.repositories.EmployeeRepositories;

@Service
public class MultipleService {
	
	@Autowired
	EmployeeRepositories da;
	
	@Transactional
	public String add(Integer a,Integer b){
		Employee e = new Employee();
		e.setId(7);
		e.setName("Mallika");
		e.setSalary("10000000");
		da.save(e);
		return String.valueOf((a+b));
	}
	

}
