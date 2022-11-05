package com.example.demo.serviceimplementation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CartItems;
import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;

@Service
@Transactional
public class OrderServiceImplementation implements OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	

	@Override
	public List<Order> getDetailsOfOrders(String customerEmail) {
		List<Order> orderItemList=new ArrayList<>();
		orderRepository.findAllByCustomerEmail(customerEmail).forEach(p->orderItemList.add(p));
		
		return orderItemList;
		
	}



	@Override
	public Order setAllValuesForOrders(List<CartItems> cartItemList, String customerEmail,float amount) {
			
		Order orders=new Order();
		for(CartItems cart:cartItemList) {
		orders.setProduct_name(cart.getProduct_name());
		orders.setProductId(cart.getProductid());
		orders.setCustomerEmail(customerEmail);
		orders.setAmount(amount);
		Date orderDate=Calendar.getInstance().getTime();
		orders.setDate(orderDate);
		orderRepository.save(orders);
		}
		return null;
	}

}
