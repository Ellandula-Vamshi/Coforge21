package com.demo.service;

import java.util.Optional;

import com.demo.pojo.Airport;

public interface AirportService {

	
	Airport specifyAirport(Airport airport);
	
	void deleteAirport(String airportCode);
	
	void updateAirport(String airportCode);
	
	Optional<Airport> getAirportDetails(String airportCode);
	
}
