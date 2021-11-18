package com.demo.airportServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.repository.ScheduledFlightRepository;
import com.demo.pojo.ScheduledFlight;
import com.demo.service.ScheduledFlightService;
@Service
public class ScheduleFlightServiceImpl implements ScheduledFlightService{

	@Autowired
	ScheduledFlightRepository scheduledFlightRepository;
	
	@Override
	public ScheduledFlight CreatScheduleFlight(ScheduledFlight scheduledFlight) {
		
		return scheduledFlightRepository.save(scheduledFlight);
	}

	@Override
	public void deleteFlightSchedule(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ScheduledFlight> getScheduledFlightDetails(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateScheduledFlight(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
