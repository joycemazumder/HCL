package com.json.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Flight {

	private int flightid;
	private String airline;
	 
	private String from;
    private String to;
	 
	private Date departure;
	private Date arrival;
	private int duration;
	private int seats;
	
	 
	
	public int getFlightid() {
		return flightid;
	}

	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	 

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	 
 

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
