package com.family.member.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.family.member.model.Employee;

@Repository
public interface EmployeeRepositories extends CrudRepository<Employee, Integer>{

}
