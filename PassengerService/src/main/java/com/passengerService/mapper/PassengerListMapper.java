package com.passengerService.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.passengerService.domain.Passenger;


 

public interface PassengerListMapper {
	
	 final String getPassengerListByFlight="	SELECT passenger.Passenger_id,passenger.first_name,passenger.last_name,passenger.email,passenger.phone FROM flightsdb.passenger";
	
	 
		 
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
	public List<Passenger> getPassengersByFlight(int flightid);
	
	
	 
	
	
	
	

}
