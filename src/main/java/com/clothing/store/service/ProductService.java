package com.clothing.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothing.store.model.Customer;
import com.clothing.store.model.Product;
import com.clothing.store.repository.CustomerRepository;
import com.clothing.store.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	

	Iterable<Product> findAll() {
		return productRepository.findAll();
	}

	public Product fingById(long id) {
		return productRepository.findById(id).get();
	}
	
	public Product saveOne(Product entity) {
		return productRepository.save(entity);
	}
	

}
