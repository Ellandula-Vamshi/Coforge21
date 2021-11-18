package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.pojo.ScheduledFlight;
import com.demo.airportServiceImpl.ScheduleFlightServiceImpl;

@RestController
@RequestMapping("/vi/api")
public class ScheduleFlightController {

	@Autowired
	ScheduleFlightServiceImpl scheduleFlightServiceImpl;
	
	@PostMapping("/createSchFlight")
	ScheduledFlight CreatScheduleFlight(@RequestBody ScheduledFlight s1)	{
		
		ScheduledFlight scheduledFlight1 = scheduleFlightServiceImpl.CreatScheduleFlight(s1);

		return scheduledFlight1;
	}
}
