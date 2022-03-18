package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Brand;
import com.demo.serviceimp.BrandServiceImp;

@RestController
@RequestMapping
public class BrandController {
	
	@Autowired
	BrandServiceImp bradImp;
	
	@PostMapping(value = "/addbranddetails")
	public String addBrandDetails(@RequestBody Brand brand) {
		Brand b = bradImp.addbranddetails(brand);
		
		if(b!=null) {
			return "inserted successfully";
		}
		else {
			return "not inserted";
		}
	}
	
	@PostMapping(value = "/addbrandwithproduct")
	public Brand saveBrand(@RequestBody Brand brad) {
		
		Brand b = bradImp.saveBrand(brad);
		
		return b;
		
	}

}
