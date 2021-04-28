package com.clothing.store.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "GRADE")
	private String grade;

	public Employee() {

	}

	public Employee(String name, String grade) {

		this.name = name;
		this.grade = grade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public CustomerProduct processProduct(Product product, Customer customer, String paymentType) {
		Map<String, PaymentType> map = PaymentType.cashPayment(product, customer, paymentType);
		if (map.containsKey(paymentType)) {
			customer.setPaymentType(map.get(paymentType));
		} else {
			System.out.println("payment not supported");
		}

		return new CustomerProduct(product, customer, this);

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}
