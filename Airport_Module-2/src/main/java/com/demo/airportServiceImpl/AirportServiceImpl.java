package com.demo.airportServiceImpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Airport;
import com.demo.repository.AirportRepository;
import com.demo.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService {

	
	AirportRepository airportRepository;
	
	@Override
	public Airport specifyAirport(Airport airport) {
		
		return airportRepository.save(airport);
	}

	@Override
	public void deleteAirport(String airportCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAirport(String airportCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Airport> getAirportDetails(String airportCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
