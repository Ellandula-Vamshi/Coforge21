package com.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.ScheduledFlight;

public interface ScheduledFlightRepository extends JpaRepository<ScheduledFlight, Integer> {

}
