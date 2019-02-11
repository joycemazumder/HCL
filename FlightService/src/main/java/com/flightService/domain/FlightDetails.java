package com.flightService.domain;

import java.util.Date;

public class FlightDetails {
	
	private int id;
	private int flightid;
	private Date departure;
	private int price;
	private int availableSeats;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	 
}
