package com.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.pojo.Brand;
import com.demo.pojo.Product;
import com.demo.prodrepositary.BrandRepositary;
import com.demo.service.BrandService;

public class BrandServiceImp implements BrandService{
	
	@Autowired
	BrandRepositary brandrep;

	@Override
	public Brand addbranddetails(Brand brand) {
		
		
		
		// TODO Auto-generated method stub
		return brandrep.save(brand);
	}
	public Brand saveBrand(Brand brad) {
		List<Product> prodlist=brad.getProdlist();
		brad.setProdlist(prodlist);
		Product p=new Product();
		p.setBrands(brad);
		brad = brandrep.save(brad);
        return brad;
    }

}
