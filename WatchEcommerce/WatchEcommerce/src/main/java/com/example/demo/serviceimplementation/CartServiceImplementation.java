package com.example.demo.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CartItems;
import com.example.demo.model.Product;
import com.example.demo.repository.CartRepository;
import com.example.demo.service.CartService;
@Service
@Transactional
public class CartServiceImplementation implements CartService{

	@Autowired
	CartRepository cartRepository;
	

	@Override
	public List<CartItems> getAllItems(CartItems cart) {
		
		return (List<CartItems>) cartRepository.findAll();
	}



	@Override
	public void deletCartItemsById(int cartid) {
		
		cartRepository.deleteById(cartid);
		
	}


	@Override
	public List<CartItems> getDetailsOfCart(String customerEmail) {
		List<CartItems> cartItemList=new ArrayList<>();
		cartRepository.findAllByCustomerEmail(customerEmail).forEach(p->cartItemList.add(p));
		
		return cartItemList;
	}


	@Override
	public void deleteAllItemsOfCart(String customer_email) {
		List<CartItems> cartItemList=new ArrayList<>();
		cartRepository.deleteAllByCustomerEmail(customer_email);
		
	}



	@Override
	public CartItems setAllValues(int productid,Product product,String customerEmail) {
		
		 CartItems cartObject=new CartItems();
		 cartObject.setProductid(product.getId());
		 cartObject.setProduct_name(product.getProduct_name());
		 cartObject.setPrice(product.getPrice());
	     cartObject.setDiscountedprice(product.getDiscountedpercentage());
	     cartObject.setCustomerEmail(customerEmail);
	     
	     cartRepository.save(cartObject);
		return null;
	}

}
