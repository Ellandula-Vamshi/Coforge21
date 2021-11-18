package com.demo.service;

import java.util.Optional;

import com.demo.pojo.Schedule;

public interface ScheduleService {

	    Schedule CreatSchedule(Schedule schedule);  
			
		void cancelSchedule(Integer id); 

	    Optional<Schedule> getScheduleDetails(Integer id); 

		void updateSchedule(Integer id); 	
}
