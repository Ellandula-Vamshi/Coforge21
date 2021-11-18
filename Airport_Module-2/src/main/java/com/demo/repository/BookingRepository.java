package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
