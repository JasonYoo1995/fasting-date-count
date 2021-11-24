package com.term.fastingdatecounter.api.review.repository;

import com.term.fastingdatecounter.api.food.domain.Food;
import com.term.fastingdatecounter.api.review.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findByFoodId(Long foodId);
}