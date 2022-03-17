package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.pojo.Product;
import com.demo.pojo.Rating;

public interface ProductService {
	
	///post
	Product addProductDetails(Product prod);
	
	//get
	Optional<Product> getdetailsbyId(long id);
	
	///get
	List<Product> getAlldetails();
	
	//get
	List<Product> getdetailsbyname(String name);
	
	//get
	List<Product> getdetailsbyDate(String date);
	
	//put
	Product updateProductDetailsBtyId( Product prod, Long id);


	// delete by id
	void deleteProductById(Long id);

}
