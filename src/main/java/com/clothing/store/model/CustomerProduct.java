package com.clothing.store.model;

public class CustomerProduct {

	private Product product;
	private Customer customer;
	private Employee employee;

	public CustomerProduct() {

	}

	public CustomerProduct(Product product, Customer customer, Employee employee) {
		this.product = product;
		this.customer = customer;
		this.employee = employee;
	}
	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CustomerProduct [product=" + product + ", customer=" + customer + ", employee=" + employee + "]";
	}

}
