package com.demo.airportServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.pojo.Airport;
import com.demo.pojo.Booking;
import com.demo.pojo.Passengers;
import com.demo.repository.SchduleRepository;
import com.demo.service.PassengerService;
@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	com.demo.repository.PassengerRepository passengerRepository;
	@Override
	public Passengers addPassenger(Passengers passengers) {
		
		return passengerRepository.save(passengers);
	}

	@Override
	public void UpDatePassenger(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelPassenger(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Passengers> getPassengerById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

	

	
}
