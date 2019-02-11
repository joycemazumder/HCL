package com.passengerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.passengerService.domain.Passenger;
import com.passengerService.domain.Ticket;
import com.passengerService.mapper.PassengerListMapper;
import com.passengerService.mapper.PassengerServiceMapper;
import com.passengerService.proxy.ReservationServiceProxy;

@RefreshScope
@RestController
public class PassengerServiceController {
	
	 @Autowired
	 PassengerServiceMapper passengerMapper;
	 
	 @Autowired
	 PassengerListMapper passengerListMapper;
	 
	  @Autowired
	 ReservationServiceProxy rsrvProxy;
	  
	 
	@GetMapping("/getPassengerList/{flight}") 
	public List<Passenger> getPassengerListByFlight(@PathVariable(value="flight") int flightid) throws Exception
	{ 
		return passengerListMapper.getPassengersByFlight(flightid);
		 
	} 
	
	@PostMapping("/addPassenger")
	 public Passenger  addPassenger(@RequestBody Passenger passenger) throws Exception
	 {
		
		Ticket t1=new Ticket();
		t1.setFlightid(2);
		t1.setFlightStatus("y");
		t1.setPassengerid(2);
	 		
		int i=passengerMapper.addPassenger(passenger);
		rsrvProxy.bookTicket(t1);
		System.out.println("passenger service:"+i);
		 return  passenger;
	 }
}