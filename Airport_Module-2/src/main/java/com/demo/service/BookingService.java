package com.demo.service;

import java.util.Optional;

import com.demo.pojo.Airport;
import com.demo.pojo.Booking;

public interface BookingService {

   Booking createBooking(Booking booking);
	
	void UpDateBooking(String airportCode);

	void cancelBooking(String airportCode);
	
	
	Optional<Booking> getBookingDetails(String airportCode);
	
}
