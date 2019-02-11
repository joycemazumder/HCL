package com.passengerService.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.passengerService.domain.Passenger;


 

public interface PassengerServiceMapper {
	
	 final String getPassengerListByFlight="	SELECT fl.flightid,fl.airline,fl.route_id,r.from_city,r.to_city,departure,fl.arrival,fl.duration,fl.seats FROM flightsdb.flight fl join Route r on fl.route_Id=r.route_id " + 
			"where r.from_city like #{city}";
	
	 
	 final String insertPassenger="INSERT INTO flightsdb.passenger (first_name, last_name, email, phone) VALUES (#{firstName}, #{lastName}, #{email}, #{phone})";
	 
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
	
	 
	@Insert(insertPassenger)
	@Options(useGeneratedKeys=true, keyProperty="passengerid")
	public int addPassenger(Passenger passenger);
	
	 
	
	
	
	

}
