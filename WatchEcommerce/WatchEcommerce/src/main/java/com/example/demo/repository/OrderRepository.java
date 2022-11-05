package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Order;

public interface OrderRepository extends CrudRepository<Order,Integer> {

	List<Order> findAllByCustomerEmail(String customerEmail);
}
