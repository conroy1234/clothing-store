package com.clothing.store.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "PRODUCT")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private BigDecimal price;
	@Column(name = "AVAILABLE_QUANTITY")
	private BigDecimal quantityInstock;
	@Transient
	private BigDecimal quantityPurchase;
	@Transient
	private BigDecimal totalPayment;

	public Product() {

	}

	public Product(String name, BigDecimal price, BigDecimal quantityInstock, BigDecimal quantityPurchase,
			BigDecimal totalPayment) {
		this.name = name;
		this.price = price;
		this.quantityInstock = quantityInstock;
		this.quantityPurchase = quantityPurchase;
		this.totalPayment = totalPayment;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQuantityInstock() {
		return quantityInstock;
	}

	public void setQuantityInstock(BigDecimal quantityInstock) {
		this.quantityInstock = quantityInstock;
	}

	public BigDecimal getQuantityPurchase() {
		return quantityPurchase;
	}

	public void setQuantityPurchase(BigDecimal quantityPurchase) {
		this.quantityPurchase = quantityPurchase;
	}

	public BigDecimal getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(BigDecimal totalPayment) {
		this.totalPayment = totalPayment;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantityInstock=" + quantityInstock
				+ ", quantityPurchase=" + quantityPurchase + ", totalPayment=" + totalPayment + "]";
	}

}
