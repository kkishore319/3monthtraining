package com.demo.prodrepositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long>{

}
