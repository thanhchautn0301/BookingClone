package com.demo.services;

import com.demo.entities_api.Turnover;

import java.util.Date;
import java.util.List;

public interface ITurnoverService {
    public List<Turnover> caculateTurnover(int hostId, int accomodationId, Date fromDate, Date untilDate  );
}
