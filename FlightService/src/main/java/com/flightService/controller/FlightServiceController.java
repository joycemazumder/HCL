package com.flightService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import  com.flightService.exception.FlightServiceException;
import com.flightService.domain.Flight;
import com.flightService.mapper.FlightServiceMapper;

@RestController
public class FlightServiceController {
	
	 @Autowired
	 FlightServiceMapper flightMapper;
	 
	 
	@GetMapping("/getAllFlights") 
	public List<Flight> getAllFlights() throws Exception
	{
		return flightMapper.getAllFlights();
		
	}
	
	@GetMapping("/getFlightFromCity/{city}") 
	public List<Flight> getFlightFromCity(@PathVariable(value="city") String city)  
	{
		try {
			city="%"+city+"%";
			return flightMapper.getFlightFromCity(city);
		} catch (Exception e) {
			
			throw new FlightServiceException(e);
		}
		 
	}
}