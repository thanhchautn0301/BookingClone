package com.demo.repositories;

import com.demo.entities.Review;
import com.demo.entities_api.ReviewApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    @Query("select new com.demo.entities_api.ReviewApi(id, customer.id, rate.id, room.id, content, ondate, status) from Review where status =true")
    public List<ReviewApi> findAllReview();

    @Query("select new com.demo.entities_api.ReviewApi(id, customer.id, rate.id, room.id, content, ondate, status) from Review where status =true")
    public List<ReviewApi> findAllReviewSort(Sort sort);

    @Query("select new com.demo.entities_api.ReviewApi(id, customer.id, rate.id, room.id, content, ondate, status) from Review where status =true")
    public List<ReviewApi> findAllReviewPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.ReviewApi(id, customer.id, rate.id, room.id, content, ondate, status) from Review where status =true and id =:id")
    public ReviewApi findReviewById(@Param("id") int id);
}
