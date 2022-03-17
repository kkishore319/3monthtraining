package com.demo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.pojo.Rating;
import com.demo.prodrepositary.RatingRepository;
import com.demo.service.RatingService;

@Component
@Repository
public class RatingServiceImp implements RatingService {
	
	@Autowired
	RatingRepository rateRepo;
	@Override
	public Rating addrating(Rating rate,long id) {
		rate.setId(id);
		
		return rateRepo.save(rate);
	}

}
