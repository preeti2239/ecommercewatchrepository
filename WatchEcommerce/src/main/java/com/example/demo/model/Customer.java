package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="customer")
public class Customer{


@Id
@Column
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column
private String firstname;
@Column
private String lastname;
@Column
private String emailid;
@Column
private String phonenumber;
@Column
private String housenumber;
@Column
private String area;
@Column
private String pincode;
@Column
private String city;
@Column
private String state;
@Column
private String password;
@Column
private String gender;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getHousenumber() {
	return housenumber;
}
public void setHousenumber(String housenumber) {
	this.housenumber = housenumber;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}






}