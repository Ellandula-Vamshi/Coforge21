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
@Table(name="Schedule")
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name="id")
	private Integer scheduleId;
	@NotNull
	@Column(name="srcAirport")
	private Airport srcAirport;
	@NotNull
	@Column(name="dstnAirport")
	private Airport dstnAirport;
	@NotNull
	@Column(name="deptDateTime")
	private String deptDateTime;
	@NotNull
	@Column(name="arrDateTime")
	private String arrDateTime;
	
	
	public Integer getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Airport getSrcAirport() {
		return srcAirport;
	}
	public void setSrcAirport(Airport srcAirport) {
		this.srcAirport = srcAirport;
	}
	public Airport getDstnAirport() {
		return dstnAirport;
	}
	public void setDstnAirport(Airport dstnAirport) {
		this.dstnAirport = dstnAirport;
	}
	public String getDeptDateTime() {
		return deptDateTime;
	}
	public void setDeptDateTime(String deptDateTime) {
		this.deptDateTime = deptDateTime;
	}
	public String getArrDateTime() {
		return arrDateTime;
	}
	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}
	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", srcAirport=" + srcAirport + ", dstnAirport=" + dstnAirport
				+ ", deptDateTime=" + deptDateTime + ", arrDateTime=" + arrDateTime + "]";
	}
	
	
	
}
