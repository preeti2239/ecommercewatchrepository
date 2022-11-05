package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderid;
	@Column
	private int productid;
	@Column
	private String product_name;
	@Column
	private float amount;
	@Column
	private String customerEmail;
	
	@Column
	@DateTimeFormat(pattern="dd/MM/yyy")
	private Date date;
		
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getOrderId() {
		return orderid;
	}
	public void setOrderId(int orderId) {
		this.orderid = orderId;
	}
	public int getProductId() {
		return productid;
	}
	public void setProductId(int productID) {
		this.productid = productID;
	}
	
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
	
}
