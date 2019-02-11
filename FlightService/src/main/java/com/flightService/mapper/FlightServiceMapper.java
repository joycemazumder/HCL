package com.flightService.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.flightService.domain.Flight;


 

public interface FlightServiceMapper {
	
	final String getAllFlights="	SELECT fl.flightid,fl.airline,r.from_city,r.to_city FROM flightsdb.flight fl join Route r on fl.route_Id=r.route_id  " ;
	final String getFlightFromCity="	SELECT fl.flightid,fl.airline,fl.route_id,r.from_city,r.to_city,departure,fl.arrival,fl.duration,fl.seats FROM flightsdb.flight fl join Route r on fl.route_Id=r.route_id " + 
			"where r.from_city like #{city}";
	
	 
	@Results(id="FlightMap",value=
	{
			@Result(column="flightid",property="flightid"),
			@Result(column="airline",property="airline"),
			@Result(column="from_city",property="from"),
			@Result(column="to_city",property="to"),
			 
	}
	)
	@Select(getAllFlights)
	//@ResultMap(value = { "FlightMap" })
	public List<Flight> getAllFlights();
	
	@Results(id="FlightMap",value=
		{
				@Result(column="flightid",property="flightid"),
				@Result(column="airline",property="airline"),
				@Result(column="from_city",property="from"),
				@Result(column="to_city",property="to"),
				 
		}
		)
	@Select(getFlightFromCity)
	@ResultMap(value = { "FlightMap" })
	public List<Flight> getFlightFromCity(String city) throws Exception;
	
	 
	
	
	
	

}
