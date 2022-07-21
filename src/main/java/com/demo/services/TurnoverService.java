package com.demo.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.repositories.TurnoverRepository;

@Service
public class TurnoverService implements ITurnoverService {

    @Autowired
    private TurnoverRepository turnoverRepository;

    @Override
    public double caculateTurnover(int hostId, int accomodationId, Date fromDate, Date untilDate  ) {
        
        return turnoverRepository.sumTotal(hostId, accomodationId, fromDate, untilDate);
    }
    
}
