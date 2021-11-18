package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.airportServiceImpl.ScheduleServiceImpl;
import com.demo.pojo.Schedule;
@RestController
@RequestMapping("/vi/api")
public class ScheduleController {

	@Autowired
	ScheduleServiceImpl ScheduleServiceImpl;
	@PostMapping("/createSchedule")
	Schedule createSchedule(@RequestBody Schedule schedule)
	{
		Schedule schedule1 = ScheduleServiceImpl.CreatSchedule(schedule);

		return schedule1;
	}
	
	@PostMapping("/deleteScheduleById")
	 void deleteScheduleById(@RequestBody Integer id)
	 {
		 // Product product=productServiceImpl.deleteProductById(id);
	 }
	
}
