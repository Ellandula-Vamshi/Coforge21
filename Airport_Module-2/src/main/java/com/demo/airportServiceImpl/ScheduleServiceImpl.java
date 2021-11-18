package com.demo.airportServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.pojo.Schedule;
import com.demo.repository.SchduleRepository;
import com.demo.service.ScheduleService;
@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	SchduleRepository repository;
	@Override
	public Schedule CreatSchedule(Schedule schedule) {
		
		return repository.save(schedule);
	}

	@Override
	public void cancelSchedule(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Schedule> getScheduleDetails(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSchedule(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
