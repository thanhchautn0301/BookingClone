package com.demo.services;

import java.util.Date;

public interface ITurnoverService {
    public double caculateTurnover(int hostId, int accomodationId, Date fromDate, Date untilDate  );
}
