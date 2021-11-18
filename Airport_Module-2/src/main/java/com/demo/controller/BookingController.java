package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.airportServiceImpl.BookingServiceImpl;
import com.demo.pojo.Booking;

@RestController
@RequestMapping("/vi/api")
public class BookingController {

	@Autowired
	BookingServiceImpl bookingServiceImpl;
	
	@PostMapping("/createBooking")
	Booking createBooking(@RequestBody Booking booking) {
		
		Booking booking1 = bookingServiceImpl.createBooking(booking);
		return booking1;
	}
	
	@PostMapping("/deletePassenger")
	 void deletePassengerById(@RequestBody Integer id)
	 {
		 // Product product=productServiceImpl.deleteProductById(id);
	 }
	
	
	
}
