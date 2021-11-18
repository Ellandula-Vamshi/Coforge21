package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.airportServiceImpl.AirportServiceImpl;
import com.demo.pojo.Airport;
import com.demo.service.AirportService;

@RestController
@RequestMapping("/vi/api")
public class AirportController {

	@Autowired
	AirportServiceImpl airportService;
	
	@PostMapping("/createairport")
   Airport createAiportDetails(@RequestBody Airport airportinfo)
   {
	 
		
	  Airport airport = airportService.specifyAirport(airportinfo);
	
	
	   return airport;
   }
	
	void deleteAirportByCode(@RequestBody Airport airport)
	{
		//Airport airport1= airportService.deleteAirport("q53");
	}
}
