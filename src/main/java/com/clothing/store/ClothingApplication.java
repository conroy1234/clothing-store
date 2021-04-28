package com.clothing.store;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clothing.store.model.Customer;
import com.clothing.store.model.Employee;
import com.clothing.store.model.Product;
import com.clothing.store.service.CustomerService;
import com.clothing.store.service.EmployeeService;
import com.clothing.store.service.ProductService;

@SpringBootApplication
public class ClothingApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService;


	public static void main(String[] args) {
		SpringApplication.run(ClothingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> employees = Arrays.asList(new Employee("Peter Grab", "Manager"),
				new Employee("Toney Flod", "Supervisor"), new Employee("Jane Something", "Customer service"));
		employees.forEach(emp -> {
			employeeService.saveOne(emp);
		});

		List<Product> products = Arrays.asList(
				new Product("Bicycle", BigDecimal.valueOf(200), BigDecimal.valueOf(20), null, null),
				new Product("Cars", BigDecimal.valueOf(3000), BigDecimal.valueOf(20), null, null),
				new Product("Desk top Computers", BigDecimal.valueOf(400), BigDecimal.valueOf(20), null, null));
		products.forEach(prod -> {
			productService.saveOne(prod);
		});
		
		List<Customer> customers = Arrays.asList(
				new Customer("Thomas Brady", "55 beam avenue london"),
				new Customer("Carol Linley", "44 wave Road55 beam avenue london")
				);
		customers.forEach(cus -> {
			customerService.saveOne(cus);
		});
	}

}