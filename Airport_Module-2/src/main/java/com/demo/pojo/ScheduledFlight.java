package com.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="scheduledFlight")
public class ScheduledFlight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name="id")
	private Integer scheduleFlightId;
	@NotNull
	@Column(name="availableSeats")
	private Integer availableSeats;
	@NotNull
	@Column(name="schedule")
	private Schedule schedule;
	
	
	public Integer getScheduleFlightId() {
		return scheduleFlightId;
	}
	public void setScheduleFlightId(Integer scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}
	public Integer getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "ScheduledFlight [scheduleFlightId=" + scheduleFlightId + ", availableSeats=" + availableSeats
				+ ", schedule=" + schedule + "]";
	}
	
	
}
