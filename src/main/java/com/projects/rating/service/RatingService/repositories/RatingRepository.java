package com.projects.rating.service.RatingService.repositories;

import com.projects.rating.service.RatingService.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RatingRepository extends MongoRepository<Rating, String> {

    public Rating findByUserId(String userId);
    public Rating findByHotelId(String hotelId);
}
