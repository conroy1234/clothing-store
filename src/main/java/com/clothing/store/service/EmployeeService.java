package com.clothing.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothing.store.model.Employee;
import com.clothing.store.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	Iterable<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public Employee fingById(long id) {
		return employeeRepository.findById(id).get();
	}
	
	public Employee saveOne(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	
}
