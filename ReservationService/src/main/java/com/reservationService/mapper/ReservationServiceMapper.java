package com.reservationService.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.reservationService.domain.Ticket;


 

public interface ReservationServiceMapper {
	
	 final String bookTicketSQL=" INSERT INTO flightsdb.ticket (flightid, passenger_id, flight_status) VALUES (#{passengerid}, #{flightid}, #{flightStatus})";
	 
	/* 
	@Results(id="PassengerMap",value=
	{
			@Result(column="passenger_id",property="passengerid"),
			@Result(column="first_name",property="firstName"),
			@Result(column="last_name",property="lastName"),
			@Result(column="email",property="email"),
			@Result(column="phone",property="phone"),
			 
	}
	)
	@Select(getPassengerListByFlight)
	@ResultMap(value = { "PassengerDetailMap" })
	public List<Passenger> getPassengersByFlight(int flightid);
	*/
	
	 
	@Insert(bookTicketSQL)
	@Options(useGeneratedKeys=true, keyProperty="passengerid")
	public int addPassenger(Ticket ticket);
	
	 
	
	

}
