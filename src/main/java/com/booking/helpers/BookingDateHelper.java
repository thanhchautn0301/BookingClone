package com.booking.helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BookingDateHelper {
	
	public static String getDateWithoutYear(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("E, dd-MM");
		String result = dateFormat.format(date);
		return result;
	}
	
	public static String getYear(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		String result = dateFormat.format(date);
		return result;
	}
	
	
	public static long countDay(Date checkIn,Date checkOut) {
		long dateBeforeInMs = checkIn.getTime();
		long dateAfterInMs = checkOut.getTime();

		long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);

		long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
	     return daysDiff;
	}
	
	public static long countDay(String checkIn,String checkOut) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date checkInDate = new Date();;
		try {
			checkInDate = sdf.parse(checkIn);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date checkOutDate = new Date();
		try {
			checkOutDate = sdf.parse(checkOut);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long dateBeforeInMs = checkInDate.getTime();
		long dateAfterInMs = checkOutDate.getTime();

		long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);

		long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
	     return daysDiff;
	}
}	
