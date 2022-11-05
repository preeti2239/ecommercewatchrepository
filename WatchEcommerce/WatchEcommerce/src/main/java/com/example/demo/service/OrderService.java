package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CartItems;
import com.example.demo.model.Order;

public interface OrderService {

	Order setAllValuesForOrders(List<CartItems> cartItemList,String customerEmail,float amount);
	
	public List<Order> getDetailsOfOrders(String customer_email);
}
