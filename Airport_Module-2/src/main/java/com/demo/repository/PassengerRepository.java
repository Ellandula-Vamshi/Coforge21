package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Passengers;

public interface PassengerRepository extends JpaRepository<Passengers, Integer>{

}
