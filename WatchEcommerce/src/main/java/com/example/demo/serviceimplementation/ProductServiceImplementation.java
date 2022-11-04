package com.example.demo.serviceimplementation;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
@Transactional
public class ProductServiceImplementation implements ProductService {

	 @Autowired
	ProductRepository productRepository; 
	
	 ProductService productService;
    List<Product> addproduct=new ArrayList(); 
   
	@Override
	public List<Product> getAllProducts() {
		
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product getProductById(int id) {
		
		return productRepository.findById(id).get();
	}

	@Override
	public void saveProduct(Product product) {
		
		 productRepository.save(product);
		
	}

	/* Below methods are used for sorting and filtering */
	@Override
	public List<String> sortUnisexByGender() {
		
		 List<Product> productList =(List<Product>) productRepository.findAll();
		 
	return productList.stream().filter(p->p.getGender().equalsIgnoreCase("unisex")).map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortMenByGender() {
		 List<Product> productList = (List<Product>) productRepository.findAll();	
		 
		return productList.stream().filter(p->p.getGender().equalsIgnoreCase("men"))
	             .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortWomenByGender() {
		
		 List<Product> productList = (List<Product>) productRepository.findAll();
		 
		return productList.stream().filter(p->p.getGender().equalsIgnoreCase("women")).map(p1->p1.getProduct_name()).collect(Collectors.toList());

	}

	@Override
	public List<String> sortKidGirlsByGender() {
		 List<Product> productList = (List<Product>) productRepository.findAll();
		
		return productList.stream().filter(p->p.getGender().equalsIgnoreCase("girls"))
                .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortKidBoysByGender() {
		 List<Product> productList = (List<Product>) productRepository.findAll();;	
		
		return productList.stream().filter(p->p.getGender().equalsIgnoreCase("boys"))
                .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByCasualWear() {
		 List<Product> productList = (List<Product>) productRepository.findAll();
		
		return productList.stream().filter(p->p.getProperties().equalsIgnoreCase("casual"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByFormalWear() {
		 List<Product> productList = (List<Product>) productRepository.findAll();	
		return productList.stream().filter(p->p.getProperties().equalsIgnoreCase("formals"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByWaterproof() {
		 List<Product> productList = (List<Product>) productRepository.findAll();	
		return productList.stream().filter(p->p.getWaterproof().equals("100m")||p.getWaterproof().equals("200m")||p.getWaterproof().equals("250m"))
                .map(p->p.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByLimitedEdition() {
		 List<Product> productList = (List<Product>) productRepository.findAll();
		return productList.stream().filter(p->p.getProperties().equalsIgnoreCase("limited edition"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortBySmartWear() {
		 List<Product> productList = (List<Product>) productRepository.findAll();	
		return productList.stream().filter(p->p.getProperties().equalsIgnoreCase("smartwatch"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList()) ;
	}

	@Override
	public List<String> sortBySportsWear() {
		 List<Product> productList = (List<Product>) productRepository.findAll();	
		return productList.stream().filter(p->p.getProperties().equalsIgnoreCase("sports"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByNewArrival() {
		 List<Product> productList = (List<Product>) productRepository.findAll();	
		return productList.stream().filter(p->p.getProperties().equalsIgnoreCase("new arrival"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByVintage() {
		 List<Product> productList = (List<Product>) productRepository.findAll();	
		return productList.stream().filter(p->p.getProperties().equalsIgnoreCase("vintage"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByPartyWear() {
		 List<Product> productList = (List<Product>) productRepository.findAll();	
		return productList.stream().filter(p->p.getProperties().equalsIgnoreCase("party wear"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByBrandHumut() {
		 List<Product> productList = (List<Product>) productRepository.findAll();
		return productList.stream().filter(p->p.getBrand_name().equalsIgnoreCase("Humut"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByBrandTitan() {
		 List<Product> productList = (List<Product>) productRepository.findAll();
		return productList.stream().filter(p->p.getBrand_name().equalsIgnoreCase("Titan"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByBrandCasio() {
		 List<Product> productList = (List<Product>) productRepository.findAll();	
		return productList.stream().filter(p->p.getBrand_name().equalsIgnoreCase("casio"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByBrandFastrack() {
		 List<Product> productList =(List<Product>) productRepository.findAll();
		 
		return productList.stream().filter(p->p.getBrand_name().equalsIgnoreCase("fastrack"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByBrandGshock() {
		 List<Product> productList =(List<Product>) productRepository.findAll();
		return productList.stream().filter(p->p.getBrand_name().equalsIgnoreCase("Gshock"))
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	@Override
	public List<String> sortByLimitedStock() {
		 List<Product> productList =(List<Product>) productRepository.findAll();
		return productList.stream().filter(p->p.getQuantity()==2)
		           .map(p1->p1.getProduct_name()).collect(Collectors.toList());
	}

	
	@Override
	public List<Product> getAllByBrand(String keyword) {
		
		List<Product> productlist=(List<Product>) productRepository.findAll();
		return productlist.stream().filter(p->p.getBrand_name().equalsIgnoreCase(keyword)).collect(Collectors.toList());
		
		
	}

}

