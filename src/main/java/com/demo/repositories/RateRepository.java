package com.demo.repositories;

import com.demo.entities.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RateRepository extends JpaRepository<Rate, Integer> {
}
