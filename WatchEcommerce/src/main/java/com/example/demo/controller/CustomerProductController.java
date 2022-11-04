package com.example.demo.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Customer;
import com.example.demo.model.Product;

import com.example.demo.service.CustomerService;
import com.example.demo.service.ProductService;

@Controller
public class CustomerProductController {
	 
	 
	Customer customerobject;
	@Autowired
	CustomerService customerService;
	
	@Autowired
	ProductService productService;
	   
    List<Product> productList =new ArrayList();
    List<Product> addproduct=new ArrayList(); 
    List list=new ArrayList();
    Product product;
     
     /*welcome page */
     
	@RequestMapping("/")
	public String indexDisplay() {
		
		return "index";
	}	
	
	/*register page*/
	
	@RequestMapping("/register")
	public String registerDispaly() {
		return "registerform";
	}
	
	
	/*from register page to homepage*/
	@SuppressWarnings("unused")
	@PostMapping("/details")
		public String formRegistration(@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname,
			@RequestParam("emailid") String emailid,
			@RequestParam("phonenumber") String phonenumber,
			@RequestParam("housenumber")String housenumber,
			@RequestParam("area")String area,
	        @RequestParam("city")String city,
	        @RequestParam("state")String state,
	        @RequestParam("pincode")String pincode,
			@RequestParam("password") String password,
			@RequestParam("gender") String gender,ModelMap model)throws Exception {

		Customer customer=null;
		if(firstname!=null || lastname!=null || emailid!=null || phonenumber!=null ||housenumber!=null ||
				area!=null || city!=null || state!=null || pincode!=null || password!=null ||gender!=null) {
			
		
		 customer=customerService.getCustomerByEmail(emailid);
		 
		 
		 if(customer!=null) {
			 model.addAttribute("error","You already have an account");
				return "login";
		 }
				 
		 else 		
			 customer=new Customer();
		     customer=customerService.setAllValues(firstname, lastname, emailid, phonenumber, housenumber, area, city, state, pincode, password, gender);
	   
		List<Product> productList=productService.getAllProducts();
		model.addAttribute("productList", productList);
		return "homepage";
		}
		else
			throw new Exception("Emailid and password are null");
	}
		
        		
	
	//from welcome page to login page
	
	@RequestMapping("/loginpage")
	public String loginDisplay() {
		
		return "login";
	}
	
	//login validation
	
	@RequestMapping("/authenticate")
	public String loginForm(@RequestParam("emailid") String emailid,@RequestParam("password") String password,Model model) throws Exception {
			
		if(emailid!=null || password!=null) {
        
		try {
			customerobject=	customerService.getLogin(emailid, password);
		}
		
		catch(Exception e){
			System.out.println("user not found");
		}
		if(customerobject!=null) {
			List<Product> productList=productService.getAllProducts();
			model.addAttribute("productList", productList);
			return "homepage";
		}
	
		model.addAttribute("error","user not found");
		addproduct.clear();
		
		return "login";
		}
		else throw new Exception("Fileds are null");
		
	}
	//showing customer his profile
	
	@RequestMapping("/profile")
	public String displayprofile(ModelMap model) {
		
		
		model.put("firstname",customerobject.getFirstname());
		model.put("lastname",customerobject.getLastname());
		model.put("phonenumber",customerobject.getPhonenumber());
		model.put("emailid",customerobject.getEmailid());
		model.put("housenumber",customerobject.getHousenumber());
		System.out.println(customerobject.getHousenumber());
		model.put("area",customerobject.getArea());
		model.put("city",customerobject.getCity());
		model.put("state",customerobject.getState());
		model.put("pincode",customerobject.getPincode());
		
		model.put("list", list);		
	     return "profile";
	}
	
	//customer updating list
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView updateList(ModelMap model) {
		
		
		model.put("firstname",customerobject.getFirstname());
		model.put("lastname",customerobject.getLastname());
		model.put("phonenumber",customerobject.getPhonenumber());
		model.put("emailid",customerobject.getEmailid());
		model.put("housenumber",customerobject.getHousenumber());
		model.put("area",customerobject.getArea());
		model.put("city",customerobject.getCity());
		model.put("state",customerobject.getState());
		model.put("pincode",customerobject.getPincode());
	  ModelAndView modelview = new ModelAndView("profile");
	  Customer customerList= customerService.getCustomerById(customerobject.getId());
	  modelview.addObject("customerList",customerList);
	
	  return modelview;
	 }
	 	
	//for profile page update button
	
	 @RequestMapping(value="/addCustomer", method=RequestMethod.GET)
	 public ModelAndView addStudent() {
		 
	  ModelAndView model = new ModelAndView();
	 
	  model.addObject("customerForm", customerobject);   //this is taking to profile update page
	  model.setViewName("profileupdate");
	  
	  return model;
	 }
	 
	//getting values from customer and redirecting to sign in page
	 
	 @PostMapping("/addCustomer")
	 public ModelAndView add(@ModelAttribute("customerForm") Customer customer) {
		 ModelAndView model = new ModelAndView();
		 
		 if(customer!=null) {
		 
	  customerService.updateCustomer(customer);
	  model.setViewName("updateionmessage");
		 }
	  return model;	  
	 }
	 
	 //profile redirect
	@RequestMapping("/updatemessage")
	public String update() {
		return "updateionmessage";
	}
	 
	 
	 //showing list of products
	 
	@RequestMapping(value="/productlist",method=RequestMethod.GET)
 public ModelAndView productList() throws Exception {
		
		ModelAndView model=new ModelAndView("addtocart");
		if(productList!=null) {
	    productList=productService.getAllProducts();
		model.addObject("productList",productList);
	    return model;
		}
		throw new Exception("List is empty");
	}    
	   
//adding to cart 
	
	    @RequestMapping("/addProduct/{id}")
	    public ModelAndView addProductToCart(@PathVariable("id") int productId) {
	    	
	    	ModelAndView modelAndView=new ModelAndView();
	    	
	    	if(productId!=0) {       
	        addproduct.add(productService.getProductById(productId));
	        modelAndView.addObject("addproduct",addproduct);
	        modelAndView.setViewName("billgenerate");
	    	}
	        return modelAndView;
	    
	    }
	    
	    //form add to cart page to billgenerate
	    @RequestMapping("/addProduct/billgenerate")  //going to cart page
	    public ModelAndView cartItem() {
	    	
	    	ModelAndView modelAndview=new ModelAndView("cartitems");
	    	modelAndview.addObject("addproduct",addproduct);
			return modelAndview;
	    	
	    }
	   	    
	   //removing specific id 
	    @RequestMapping("/remove/{id}")
	    public ModelAndView remove(@PathVariable("id")int id) {

	    	 int index=0;
	    	ModelAndView modelAndView=new ModelAndView();
	    	addproduct.remove(addproduct.get(index));
	    	modelAndView.addObject("addproduct", addproduct);
	    	modelAndView.setViewName("billgenerate");
	    	return modelAndView;
	    }
	    
	    //removing all items from cart
	    @RequestMapping("/addProduct/removeall")
	    public ModelAndView removeAll() {
	    	addproduct.clear();
	    	ModelAndView modelAndview=new ModelAndView("billgenerate");
	    	modelAndview.addObject("addproduct",addproduct);	    	
	    	return new ModelAndView("redirect:/productlist");
	    }
	    
	    
	  
	    /*placing order*/
	    
	    @RequestMapping("/addProduct/placeorder")
	    public ModelAndView placeorder() {
	    	
	    	ModelAndView modelAndview=new ModelAndView("palceorder");
	    	List<String> itemordered=addproduct.stream().map(p->p.getProduct_name()).collect(Collectors.toList());	       
	    	modelAndview.addObject("itemordered",itemordered);
		return modelAndview;
	    }
	    
	    /*  My orders displaying */
	    @RequestMapping("/myorders")
	    public ModelAndView orderDisplay() {
	    	
	    	ModelAndView modelView=new ModelAndView("Myorders");
	    	modelView.addObject("addproduct",addproduct);
	    	return modelView;
	    	
	    }
 
	    
	    @RequestMapping("/addProduct/myorders")
	    public ModelAndView displayOrders() {
	    	ModelAndView modelAndView=new ModelAndView("Myorders");
	    	modelAndView.addObject("addproduct",addproduct);
	    	return modelAndView;
	    }
	  
	
	@RequestMapping("/add")
	public String addtocart() {
		return "addtocart";
	}
	

	
	
	@RequestMapping("/sortunisex")
	public ModelAndView displayUnisexList() {
	List<String> listOfUnisex= productService.sortUnisexByGender();	
	ModelAndView modelView=new ModelAndView("unisex");
	modelView.addObject("listOfUnisex",listOfUnisex);		
	return modelView;
	}
	
	@RequestMapping("/sortwomen")
	public ModelAndView displayWomenList() {
		
		List<String> listOfWomen=productService.sortWomenByGender();
		ModelAndView modelView=new ModelAndView("women");
		modelView.addObject("listOfWomen",listOfWomen);
		
		return modelView;
	}
	
	@RequestMapping("/sortmen")
	public ModelAndView displayMenList() {
		List<String> listOfMen=productService.sortMenByGender();
		ModelAndView modelView=new ModelAndView("menwatch");
		modelView.addObject("listOfMen",listOfMen);
		
		return modelView;
	}
	
	@RequestMapping("/sortboys")
	public ModelAndView displayBoysList() {
		List<String> listOfBoys=productService.sortKidBoysByGender();
		ModelAndView modelView=new ModelAndView("boys");
		modelView.addObject("listOfBoys",listOfBoys);
		
		return modelView;
	}
	
	@RequestMapping("/sortgirls")
	public ModelAndView displayGirlsList() {
		
		List<String> listOfGirls=productService.sortKidGirlsByGender();
		ModelAndView modelView=new ModelAndView("girls");
		modelView.addObject("listOfGirls",listOfGirls);
		
		return modelView;
	}
	
	@RequestMapping("/sortcasual")
	public ModelAndView displayCasualWear() {
		List<String> listOfCasual=productService.sortByCasualWear();
		ModelAndView modelView=new ModelAndView("casualwear");
		modelView.addObject("listOfCasual",listOfCasual);
	   return modelView;
	}
	
	
	@RequestMapping("/sortformal")
	public ModelAndView displayFormalWear() {
		
		List<String> listOfFormal=productService.sortByFormalWear();
		ModelAndView modelView=new ModelAndView("formalwear");
		modelView.addObject("listOfFormal",listOfFormal);
	   return modelView;
	}
	
	
	@RequestMapping("/sorthermetic")
	public ModelAndView displayHermetic() {
		
      List<String> listOfWaterproof=productService.sortByWaterproof();
	   ModelAndView modelView=new ModelAndView("hermetic");
	   modelView.addObject("listOfWaterproof",listOfWaterproof);
	   return modelView;
	}
	
	
	@RequestMapping("/sortlimited")
	public ModelAndView displayLimitedEdition() {

		List<String> listOfLimitedEdition=productService.sortByLimitedEdition();
		ModelAndView modelView=new ModelAndView("limitededition");
		modelView.addObject("listOfLimitedEdition",listOfLimitedEdition);
		
		return modelView;
	}
	
	@RequestMapping("/sortsmart")
	public ModelAndView displaySmartWear() {
	
		List<String> listOfSmartWatch=productService.sortBySmartWear();
		ModelAndView modelView=new ModelAndView("smartwatch");
		modelView.addObject("listOfSmartWatch",listOfSmartWatch);
		return modelView;
	}
	
	@RequestMapping("/sortsport")
	public ModelAndView displaySportsWear() {
		
		List<String> listOfSports=productService.sortBySportsWear();
		ModelAndView modelView=new ModelAndView("sportwatch");
		modelView.addObject("listOfSports",listOfSports);
		return modelView;
	}
	
	@RequestMapping("/sortnewarrival")
	public ModelAndView displayNewArrival() {
		
		List<String> listOfNewArrivals=productService.sortByNewArrival();
		ModelAndView modelView=new ModelAndView("newarrivals");
		modelView.addObject("listOfNewArrivals",listOfNewArrivals);
		return modelView;
	}
	
	@RequestMapping("/sortvintage")
	public ModelAndView displayVintage() {
	
		List<String> listOfVintage=productService.sortByVintage();
		ModelAndView modelView=new ModelAndView("vintage");
		modelView.addObject("listOfVintage",listOfVintage);
		return modelView;
	}
	
	
	@RequestMapping("/sortparty")
	public ModelAndView displayPartyWear() {
		
		List<String> listOfPartyWear=productService.sortByPartyWear();
		ModelAndView modelView=new ModelAndView("partywear");
		modelView.addObject("listOfPartyWear",listOfPartyWear);
		return modelView;
	}

	 @RequestMapping("/sorthumut")
	 public ModelAndView sortHumut() {
		 
			List<String> listOfBrandHumut=productService.sortByBrandHumut();
			ModelAndView modelView=new ModelAndView("Humut");
			modelView.addObject("listOfBrandHumut",listOfBrandHumut);
			return modelView; 
	 }
	 
     @RequestMapping("/sorttitan")
     public ModelAndView sortTitan() {

		List<String> listOfBrandTitan=productService.sortByBrandTitan();
		ModelAndView modelView=new ModelAndView("Titan");
		modelView.addObject("listOfBrandTitan",listOfBrandTitan);
		return modelView; 
}

     @RequestMapping("/sortcasio")
     public ModelAndView sortCasio() {

		List<String> listOfBrandCasio=productService.sortByBrandCasio();
		ModelAndView modelView=new ModelAndView("Casio");
		modelView.addObject("listOfBrandCasio",listOfBrandCasio);
		return modelView; 
}
 
     @RequestMapping("/sortfastrack")
     public ModelAndView sortFastrack() {
	
		List<String> listOfBrandFastrack=productService.sortByBrandFastrack();
		ModelAndView modelView=new ModelAndView("Fastrack");
		modelView.addObject("listOfBrandFastrack",listOfBrandFastrack);
		return modelView; 
}

     @RequestMapping("/sortgshock")
     public ModelAndView sortGshock() {
    	 
	  List<String> listOfBrandGshock=productService.sortByBrandGshock();
	  ModelAndView modelView=new ModelAndView("G-shock");
	  modelView.addObject("listOfBrandGshock",listOfBrandGshock);
	  return modelView;
}

     @RequestMapping("/sortlimitedstock")
    public ModelAndView sortLimitedStock() {
    	 
	List<String> listOfBrandstock=productService.sortByLimitedStock();
	ModelAndView modelView=new ModelAndView("limitedstock");
	modelView.addObject("listOfBrandstock",listOfBrandstock);
	return modelView; 
}


@RequestMapping("/backprofile")
public String backToProfile() {
	return "profile";
}
@RequestMapping("/backcart")
public String backToCart() {
	return "addtocart";
}
@RequestMapping("/logout")
public String loggingoff() {
	return "index";
}
@RequestMapping("/remove/back")
public ModelAndView backTocart() {
	
	ModelAndView model=new ModelAndView("addtocart");
    productList=productService.getAllProducts();
	model.addObject("productList",productList);
    return model;
	
}	
	
@RequestMapping("/remove/billgenerate")
public String billError() {
	
	return "billerror";
}


@RequestMapping("/continueshopping")
public String continueShoppingFromEmptyCart() {
	
	return "billerror";
}

@RequestMapping("/addproduct/back")
public ModelAndView backToCartPage(ModelAndView modelAndView) {
	List<Product> productList=productService.getAllProducts();
	modelAndView.addObject("productList", productList);
	modelAndView.setViewName("homepage");
	return 	modelAndView;
}

@RequestMapping("/back")
public ModelAndView backToHomePage(ModelAndView modelAndView) {
	List<Product> productList=productService.getAllProducts();
	modelAndView.addObject("productList", productList);
	modelAndView.setViewName("homepage");
	return modelAndView ;
}

@RequestMapping("/homepage")
public ModelAndView homePageView()
{
	ModelAndView modelAndView=new ModelAndView("homepage");
		List<Product> productList=productService.getAllProducts();
		modelAndView.addObject("productList", productList);
	return modelAndView;
}

@RequestMapping("/removeAll")
public ModelAndView removeAllFromCart() {
	
	addproduct.clear();
	return new ModelAndView("redirect:/homepage");
}


@RequestMapping(value="/watch1",method=RequestMethod.GET)
public ModelAndView watchDisplay1(@RequestParam int id,ModelAndView modelAndView) {
	product=productService.getProductById(id);
	modelAndView.addObject("product",product);
	modelAndView.setViewName("1.Arcade-Grey Dail Silicon Strap FasTrack.");
	return modelAndView;
}

@RequestMapping(value="/searchList",method =RequestMethod.POST)
	public ModelAndView searchBar(@RequestParam String keyword,ModelAndView modelView) throws Exception {
		
			if(keyword!=null) {
				
				List<Product> searchList=productService.getAllByBrand(keyword);
				modelView.addObject("searchList",searchList);
				modelView.setViewName("homepage");
				return modelView;
			}
	else {
		throw new Exception("search is empty");
	}
	
}




















}

