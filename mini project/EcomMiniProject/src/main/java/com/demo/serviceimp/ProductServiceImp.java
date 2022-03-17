package com.demo.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.pojo.Product;
import com.demo.prodrepositary.ProductRepositary;
import com.demo.service.ProductService;

@Component
@Repository
public class ProductServiceImp implements ProductService{
	
	@Autowired
	ProductRepositary prodRepo;

	@Override
	public Product addProductDetails(Product prod) {
		
		return prodRepo.save(prod);
	}



	@Override
	public Optional<Product> getdetailsbyId(long id) {
		Optional<Product> prod=prodRepo.findById(id);
		return prod;
	}

	@Override
	public List<Product> getAlldetails() {
		List<Product> product =prodRepo.findAll(); 
		return product;
	}

	@Override
	public List<Product> getdetailsbyname(String name) {
		List<Product> p=prodRepo.findByName(name);
		return p;
	}

	@Override
	public List<Product> getdetailsbyDate(String date) {
		List<Product> p=prodRepo.findByDate(date);
		return p;
	}

	@Override
	public Product updateProductDetailsBtyId(Product prod, Long id) {
		prod.setId(id);
		prod.getName();
		prod.getInfo();
		prod.getPrice();
		prod.getDate();
		Product p=prodRepo.save(prod);
		return p;
	}

	@Override
	public void deleteProductById(Long id) {
		prodRepo.deleteById(id);
	}
	
	

}
