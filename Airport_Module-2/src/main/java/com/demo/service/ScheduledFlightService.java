package com.demo.service;

import java.util.Optional;

import com.demo.pojo.ScheduledFlight;

public interface ScheduledFlightService {

	ScheduledFlight CreatScheduleFlight(ScheduledFlight scheduledFlight); 
	
	void deleteFlightSchedule(Integer id); 

     Optional<ScheduledFlight> getScheduledFlightDetails(Integer id); 

	void updateScheduledFlight(Integer id); 	
}
