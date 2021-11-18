package com.demo.airportServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.pojo.Airport;
import com.demo.pojo.Booking;
import com.demo.repository.BookingRepository;
import com.demo.service.BookingService;
@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	BookingRepository bookingRepository;
	
	@Override
	 public Booking createBooking(Booking booking) {
		
		return bookingRepository.save(booking);
	}

	@Override
	public void UpDateBooking(String airportCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelBooking(String airportCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Booking> getBookingDetails(String airportCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
