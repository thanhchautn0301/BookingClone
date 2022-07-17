package com.demo.services;

import com.demo.entities.Review;
import com.demo.entities.Room;
import com.demo.entities.Customer;
import com.demo.entities.Rate;
import com.demo.entities_api.ReviewApi;
import com.demo.repositories.ReviewRepository;
import com.demo.repositories.RoomRepository;
import com.demo.repositories.CustomerRepository;
import com.demo.repositories.RateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements IReviewService {
	
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private RateRepository rateRepository;
    @Autowired
    private RoomRepository roomRepository;
    
    @Override
    public List<ReviewApi> findall() {
        return reviewRepository.findAllReview();
    }

    @Override
    public ReviewApi findReviewById(int reviewId) {
        return reviewRepository.findReviewById(reviewId);
    }

    @Override
    public ReviewApi create(ReviewApi reviewApi) {
        try {
        	Review review = new Review();

        	review.setContent(reviewApi.getContent());
            review.setOndate(review.getOndate());
            
            Customer customer = customerRepository.findById(reviewApi.getCustomer_id()).get();
            review.setCustomer(customer);
            Rate rate = rateRepository.findById(reviewApi.getRate_id()).get();
            review.setRate(rate);
            Room room = roomRepository.findById(reviewApi.getRoom_id()).get();
            review.setRoom(room);
        	review.setStatus(reviewApi.isStatus());
        	
        	Review newReview = reviewRepository.save(review);
        	reviewApi.setId(newReview.getId());
            return reviewApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(ReviewApi reviewApi) {
       try {
           Review review = reviewRepository.findById(reviewApi.getId()).get();

            review.setContent(reviewApi.getContent());
            review.setOndate(review.getOndate());
            
            Customer customer = customerRepository.findById(reviewApi.getCustomer_id()).get();
            review.setCustomer(customer);
            Rate rate = rateRepository.findById(reviewApi.getRate_id()).get();
            review.setRate(rate);
            Room room = roomRepository.findById(reviewApi.getRoom_id()).get();
            review.setRoom(room);
        	review.setStatus(reviewApi.isStatus());

           return reviewRepository.save(review)!=null;
       } catch(Exception e) {
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean delete(int reviewId) {
        try {
        	Review review = reviewRepository.findById(reviewId).get();
        	review.setStatus(false);
        	return reviewRepository.save(review)!=null;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<ReviewApi> findallreviewwithsort(String field) {
        return reviewRepository.findAllReviewSort(Sort.by(field));
    }

    @Override
    public List<ReviewApi> findallreviewpaginate(int offset, int no) {
        return reviewRepository.findAllReviewPagination(PageRequest.of(offset,no));
    }
}
