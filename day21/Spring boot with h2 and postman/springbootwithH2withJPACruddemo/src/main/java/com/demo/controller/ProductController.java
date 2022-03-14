package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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

	// dependency injected her of service class
	@Autowired
	ProductServiceImp productServiceimp;

	/**
	 * @param product
	 * @return
	 */
	@PostMapping(value = "/addproduct")
	public String addProductDetailsBy(@RequestBody Product product) {

		Product p = productServiceimp.AddDetailsbyId(product);

		if (p != null) {
			return "insert sucessfully";

		} else {

			return "insert not sucessfully";
		}

	}

	/**
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/getproductbyid/{id}")
	public Optional<Product> GetdetailsById(@PathVariable("id") long id) {
		System.out.println("inside the Optional<Product> GetdetailsById(long id) ");
		Optional<Product> prodlist = productServiceimp.GetdetailsbyId(id);
		return prodlist;

	}
	
	/**
	 * @return
	 */
	@GetMapping(value="/getalldetails")
	public List<Product> GetAlldetails(){
		
		List<Product> list= productServiceimp.GetdetailsOfProducts();
		
		return list;		
	}
	
	@PutMapping(value="/updateproductbyid/{id}")
	public Product UpdatedetailsbyId(@RequestBody Product product,@PathVariable long id) {
		
		Product pro=productServiceimp.UpdateProductDetailsbyId(product, id);
		return pro;	
	}
	
	
	@DeleteMapping(value = "/deleteproductbyid/{id}")
	public String deleteProductById(@PathVariable("id") Long prodId) {

		try {

			Optional<Product> p = GetdetailsById(prodId); // if it exist in db thne it return id

			if (p != null) {

				productServiceimp.DeleteProductbyId(prodId);
				return "deleted";
			}

		} catch (Exception e) {

			e.printStackTrace();

		}
		return "id not found";

	}

}
