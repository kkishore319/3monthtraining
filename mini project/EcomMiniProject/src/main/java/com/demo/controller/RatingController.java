package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Rating;
import com.demo.service.RatingService;

@RestController
@RequestMapping( "/rating")
public class RatingController {

	@Autowired
	RatingService rateservimp;

	@PutMapping("/addrating/{id}")
	String AddRatingDetails(@RequestBody Rating rate, @PathVariable long id) {

		Rating r = rateservimp.addrating(rate, id);

		if (r != null) {

			return "inserted succesfully";
		} else {

			return "not inserted";

		}
	}

}
