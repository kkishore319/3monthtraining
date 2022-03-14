package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Product;

@Service
public interface ProductService {
	
	//post
	Product AddDetailsbyId(Product prod);
	
	//get
	List<Product> GetdetailsOfProducts();
	
	//put
	Product UpdateProductDetailsbyId(Product product,long id);
	
	//get
	Optional<Product> GetdetailsbyId(long id);
	
	//delete by id
	void DeleteProductbyId(long id);
	

}
