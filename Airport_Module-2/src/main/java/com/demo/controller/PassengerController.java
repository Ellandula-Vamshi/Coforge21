package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.airportServiceImpl.BookingServiceImpl;
import com.demo.airportServiceImpl.PassengerServiceImpl;
import com.demo.pojo.Passengers;

@RestController
@RequestMapping("/vi/api")
public class PassengerController {

	@Autowired
	PassengerServiceImpl passengerServiceImple;
	
    @PostMapping("/createPassengerdetail")
	Passengers createPassengerdetail(@RequestBody Passengers passengers)
	{

    	Passengers sassengers1 = passengerServiceImple.addPassenger(passengers);

		return sassengers1;

	}
    
   // @Override
	//public void cancelPassenger(Integer id) {
		
    	//passengerServiceImple.cancelPassenger(id);
	//}
}
