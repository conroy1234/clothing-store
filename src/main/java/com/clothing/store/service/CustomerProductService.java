package com.clothing.store.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothing.store.model.Customer;
import com.clothing.store.model.CustomerProduct;
import com.clothing.store.model.Product;

@Service
public class CustomerProductService {
	
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService;

	
	
	public CustomerProduct checkOut(Customer customer, long ProductId, long employeeId,String paymentType,BigDecimal quantity) {
		Product product = productService.fingById(ProductId);
		product.setQuantityPurchase(quantity);
		product.setTotalPayment(quantity.multiply(product.getPrice()));
		CustomerProduct customerProd= customer.checkoutProduct(product,employeeService.fingById(employeeId),paymentType);
		return customerProd;
	}

}
