package com.demo.service;

import java.util.Optional;

import com.demo.pojo.Airport;
import com.demo.pojo.Booking;
import com.demo.pojo.Passengers;

public interface PassengerService {

	
    Passengers addPassenger(Passengers passengers);
	
	void UpDatePassenger(Integer id);

	void cancelPassenger(Integer id);
	
	
	Optional<Passengers> getPassengerById(Integer id); 
	  
}
