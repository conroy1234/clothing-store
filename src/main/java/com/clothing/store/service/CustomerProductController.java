package com.clothing.store.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.clothing.store.model.Customer;
import com.clothing.store.model.CustomerProduct;

@RestController
public class CustomerProductController {

	@Autowired
	CustomerProductService customerProductService;
	@Autowired
	CustomerService customerService;

	@GetMapping(path = "/product/customerId/{customerId}/productId/{productId}/employeeId/{employeeId}/paymentType/{paymentType}/quantity/{quantity}/")
	public CustomerProduct getProduct(@PathVariable long customerId, @PathVariable long productId,
			@PathVariable long employeeId, @PathVariable String paymentType, @PathVariable BigDecimal quantity
			) {
		Customer customer = customerService.fingById(customerId);
		return customerProductService.checkOut(customer, productId, employeeId, paymentType, quantity);

	}
}
