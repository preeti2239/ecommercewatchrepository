package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
@EnableJpaRepositories
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	Customer findByEmailidAndPassword(String emailid,String password);
	
	Customer findByEmailid(String emailid);
	

}