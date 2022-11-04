package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;


public interface ProductService{

	public List<Product> getAllProducts();
	 
	 public Product getProductById(int id);
	 
	 public void saveProduct(Product product);
	 
	 public List<Product> getAllByBrand(String keyword);
	
	 public List<String> sortUnisexByGender();
	 
	 public List<String> sortMenByGender();
	 
	 public List<String> sortWomenByGender();

	 public List<String> sortKidGirlsByGender();
	 
	 public List<String> sortKidBoysByGender();
	 
	 public List<String> sortByCasualWear();
	 
	 public List<String> sortByFormalWear();
	 
	 public List<String> sortByWaterproof();
	 
	 public List<String> sortByLimitedEdition();
	 
	 public List<String> sortBySmartWear();
	 
	 public List<String> sortBySportsWear();
	 
	 public List<String> sortByNewArrival();
	 
	 public List<String> sortByVintage();
	 
	 public List<String> sortByPartyWear();
	 
	 public List<String> sortByBrandHumut();
	 
	 public List<String> sortByBrandTitan();
	 
	 public List<String> sortByBrandCasio();
	 
	 public List<String> sortByBrandFastrack();
	 
	 public List<String> sortByBrandGshock();
	 
	 public List<String> sortByLimitedStock();
	 
}
