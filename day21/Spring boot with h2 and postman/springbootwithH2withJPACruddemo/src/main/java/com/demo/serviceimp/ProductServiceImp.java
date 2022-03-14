package com.demo.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Product;
import com.demo.productrepositary.ProductRepositary;
import com.demo.service.ProductService;

@Component
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductRepositary productRespositary; // reference of data layer or bussiness logic class

	/**
	 * Add of ~ Product save method
	 */
	@Override
	public Product AddDetailsbyId(Product prod) {
		// TODO Auto-generated method stub
		return productRespositary.save(prod);
	}

	/**
	 * findAll for all details
	 */
	@Override
	public List<Product> GetdetailsOfProducts() {
		List<Product> list = productRespositary.findAll();
		// TODO Auto-generated method stub
		return list;
	}

	/**
	 * get details by id ~ findById methid
	 */
	@Override
	public Optional<Product> GetdetailsbyId(long id) {
		Optional<Product> detailsofProduct = productRespositary.findById(id);

		// TODO Auto-generated method stub
		return detailsofProduct;
	}

	@Override
	public Product UpdateProductDetailsbyId(Product product, long id) {
		product.setId(id);
		product.getProductname();
		product.getColor();
		product.getOs();
		product.getSpecfications();

		Product p = productRespositary.save(product);

		return p;
	}

	@Override
	public void DeleteProductbyId(long id) {
		productRespositary.deleteById(id);
		// TODO Auto-generated method stub
	}

}
