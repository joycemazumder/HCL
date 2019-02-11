package com.reservationService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservationService.domain.Ticket;
import com.reservationService.mapper.ReservationServiceMapper;

@RestController
public class ReservationServiceController {
	
	 @Autowired
	 ReservationServiceMapper reservationMapper;
 
	 
	@PostMapping("/bookTicket") 
	public int bookTicket(@RequestBody Ticket ticket) throws Exception
	{
		return reservationMapper.addPassenger(ticket);
		
	}
	
	 
}