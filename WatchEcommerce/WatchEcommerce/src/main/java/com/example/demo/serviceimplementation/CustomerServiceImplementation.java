package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImplementation implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
		
	}

	@Override
	public Customer getLogin(String email, String password) {		
		Customer customer=customerRepository.findByEmailidAndPassword(email, password);
		return customer;
	}

	@Override
	public Customer getCustomerById(int id) {
		
		return customerRepository.findById(id).get();
	}

	@Override
	public void updateCustomer(Customer customer) {
		 customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerByEmail(String emailid) {
		
		Customer customer=customerRepository.findByEmailid(emailid);
		return customer;
	}

	@Override
	public Customer setAllValues(String firstname, String lastname, String emailid, String phonenumber,
			String housenumber, String area, String city, String state, String pincode, String password,
			String gender)  {
		Customer customerobject=new Customer();

		customerobject.setFirstname(firstname);
		customerobject.setLastname(lastname);
		customerobject.setPhonenumber(phonenumber);
		customerobject.setHousenumber(housenumber);
		customerobject.setArea(area);
		customerobject.setCity(city);
        customerobject.setState(state);
        customerobject.setPincode(pincode);
		customerobject.setEmailid(emailid);
		customerobject.setPassword(password);
		customerobject.setGender(gender);
		customerRepository.save(customerobject); 
		
		return customerobject ;
	}
 
	

	

}