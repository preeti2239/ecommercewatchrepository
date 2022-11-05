package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@Column
	private int id; 
	@Column
	private String product_name;
	@Column
	private String brand_name;
	@Column
	private String case_shape;
	@Column
	private String case_thikness;
	@Column
	private String case_daimeter;
	@Column
	private String strap_width;
	@Column
	private String case_material;
	@Column
	private String strap_material;
	@Column
	private String bezel_material;
	@Column
	private String waterproof;
	@Column
	private String display;
	@Column
	private String movement;
	@Column
	private String gender;
	@Column
	private String properties;
	@Column
	private float price;
	@Column
	private float rating;
	@Column
	private int delivery_days;
	
	@Column
	private int quantity;
	@Column
	private int discountedpercentage;
	@Column
	private String image;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getDiscountedpercentage() {
		return discountedpercentage;
	}
	public void setDiscountedpercentage(int discountedpercentage) {
		this.discountedpercentage = discountedpercentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getCase_shape() {
		return case_shape;
	}
	public void setCase_shape(String case_shape) {
		this.case_shape = case_shape;
	}
	public String getCase_thikness() {
		return case_thikness;
	}
	public void setCase_thikness(String case_thikness) {
		this.case_thikness = case_thikness;
	}
	public String getCase_daimeter() {
		return case_daimeter;
	}
	public void setCase_daimeter(String case_daimeter) {
		this.case_daimeter = case_daimeter;
	}
	public String getStrap_width() {
		return strap_width;
	}
	public void setStrap_width(String strap_width) {
		this.strap_width = strap_width;
	}
	public String getCase_material() {
		return case_material;
	}
	public void setCase_material(String case_material) {
		this.case_material = case_material;
	}
	public String getStrap_material() {
		return strap_material;
	}
	public void setStrap_material(String strap_material) {
		this.strap_material = strap_material;
	}
	public String getBezel_material() {
		return bezel_material;
	}
	public void setBezel_material(String bezel_material) {
		this.bezel_material = bezel_material;
	}
	public String getWaterproof() {
		return waterproof;
	}
	public void setWaterproof(String waterproof) {
		this.waterproof = waterproof;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getMovement() {
		return movement;
	}
	public void setMovement(String movement) {
		this.movement = movement;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getDelivery_days() {
		return delivery_days;
	}
	public void setDelivery_days(int delivery_days) {
		this.delivery_days = delivery_days;
	}
	
	
}