package com.demo.services;

import com.demo.entities_api.ReviewApi;

import java.util.List;

public interface IReviewService {
    public List<ReviewApi> findall();
    public ReviewApi findReviewById(int reviewId);
    public ReviewApi create(ReviewApi reviewId);
    public boolean update(ReviewApi reviewId);
    public boolean delete(int reviewId);
    public List<ReviewApi> findallreviewwithsort(String field);
    public List<ReviewApi> findallreviewpaginate(int offset, int no);
}
