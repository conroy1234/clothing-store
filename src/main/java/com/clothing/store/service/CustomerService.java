package com.clothing.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothing.store.model.Customer;
import com.clothing.store.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	

	Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}

	public Customer fingById(long id) {
		return customerRepository.findById(id).get();
	}
	
	public Customer saveOne(Customer entity) {
		return customerRepository.save(entity);
	}
	

	
}
