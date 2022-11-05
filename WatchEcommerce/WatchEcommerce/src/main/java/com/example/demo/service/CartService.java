package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CartItems;
import com.example.demo.model.Product;

public interface CartService {

	public List<CartItems> getAllItems(CartItems cart);
	
	public CartItems setAllValues(int productid,Product product,String customerEmail);

	public void deletCartItemsById(int cartid);
	
	public List<CartItems> getDetailsOfCart(String customer_email);
	
	public void deleteAllItemsOfCart(String customer_email);

}
