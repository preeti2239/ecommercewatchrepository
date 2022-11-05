package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartitems")
public class CartItems {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartid;
	@Column
	private int productid;
	@Column 
	private String product_name;
	@Column
	private float price;
	@Column
	private int discountedprice;
	@Column
	private String customerEmail;
	
	
	
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getDiscountedprice() {
		return discountedprice;
	}
	public void setDiscountedprice(int discountedprice) {
		this.discountedprice = discountedprice;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	
	
}
