package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.*;

public interface CustomerService {

	
public Customer getLogin(String email,String password);

public Customer getCustomerById(int id);
 public void updateCustomer(Customer customer);

 public Customer getCustomerByEmail(String email);
 
 public Customer setAllValues(String firstname,String lastname,String emailid,String phonenumber,String housenumber,
			String area, String city, String state, String pincode, String password,String gender);
	
 

}