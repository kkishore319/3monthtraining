package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Product;
import com.demo.serviceimp.ProductServiceImp;

@RestController
@RequestMapping("/prod")
public class ProductController {
	
	@Autowired
	ProductServiceImp prodservimp;
	
	@PostMapping(value = "/addproduct")
	public String addProductDetails(@RequestBody Product product) {
		Product p = prodservimp.addProductDetails(product);

		if (p != null) {
			return "inserted successfully";
		} else {
			return "not inserted";
		}
	}
	@PutMapping("/updateproduct/{id}")
	public Product UpdatePrductbyId(@RequestBody Product prod,@PathVariable long id) {
			Product pr=prodservimp.updateProductDetailsBtyId(prod, id);
			return pr;
			
		}
	@GetMapping("/getproductbyid/{id}")
	public Optional<Product> getdetailsbyId(@PathVariable long id) {
		Optional<Product> opro= prodservimp.getdetailsbyId(id);
		return opro;	
	}
	@GetMapping("/getproductbyname/{name}")
	public List<Product> getdetailsbyName(@PathVariable String name){
		List<Product> prod=prodservimp.getdetailsbyname(name);
		return prod;	
	}
	@GetMapping("/getproductbydate/{date}")
	public List<Product> getdetailsbyDate(@PathVariable String date){
		List<Product> prod=prodservimp.getdetailsbyDate(date);
		return prod;	
	}
	
	@GetMapping("/getallproducts")
	public List<Product> getAlldetails(){
		List<Product> prod=prodservimp.getAlldetails();
		return prod;	
	}
	@RequestMapping("/deleteproductbyid")
	public String DeleteProductbyId(@PathVariable long id) {
		try {
			Optional<Product> prod=prodservimp.getdetailsbyId(id);
			if (prod!=null) 
			{
				prodservimp.deleteProductById(id);
				return "deleted successfully";
			}
			
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		 
		return "that product is not found";
			
	}

}
