package com.FlightService.Test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.PathVariable;

import com.application.flightService.FlightsServiceApplication;
import com.flightService.controller.FlightServiceController;
import com.flightService.domain.Flight;
import com.flightService.mapper.FlightServiceMapper;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.http.MediaType;
import org.skyscreamer.jsonassert.JSONAssert;
@RunWith(SpringRunner.class)
@WebMvcTest(value = FlightServiceController.class)
@ContextConfiguration(classes={FlightsServiceApplication.class})

public class FlightServiceControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	
	@MockBean
	 FlightServiceMapper flightMapper;

	 

	 
	@Test
	public void getFlightFromCityTest() throws Exception
	{
		Flight flight = new Flight();
		flight.setFlightid(1);
		flight.setAirline("IC");
		flight.setFrom("Kolkata");
		flight.setTo("Delhi");
		
		String flightJson = "{\"flightid\":\"Spring\",\"airline\":\"10 Steps\",\"from\":\"2019-01-31T23:30:01.000+0000\"]}";
		
		List<Flight> flightList=Arrays.asList(flight);

		Mockito.when(flightMapper.getFlightFromCity(Mockito.anyString())).thenReturn(flightList);
				 

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/getFlightFromCity/Kolkata").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "[{\"flightid\":1,\"airline\":\"IC\",\"from\":\"Kolkata\"}]";

			JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false); 
	}

		
		
	
	@Test
	public void getAllFlightsTests() throws Exception 
	{
		Flight flight1 = new Flight();
		flight1.setFlightid(1);
		flight1.setAirline("IC");
		flight1.setFrom("Kolkata");
		flight1.setTo("Delhi");
		Flight flight2 = new Flight();
		flight2.setFlightid(1);
		flight2.setAirline("IC");
		flight2.setFrom("Kolkata");
		flight2.setTo("Delhi");
		
		Flight flightArray[]= {flight1};
		
		String flightJson = "[{\"flightid\":\"Spring\",\"airline\":\"10 Steps\",\"from\":\"2019-01-31T23:30:01.000+0000\"}]";
		
		List<Flight> flightList=Arrays.asList(flight1,flight2);

		Mockito.when(flightMapper.getAllFlights()).thenReturn(flightList);
				 

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/getAllFlights");

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(">>"+result.getResponse().getContentAsString());
		String expected = "[{\"flightid\":1,\"airline\":\"IC\",\"from\":\"Kolkata\"},{\"flightid\":1,\"airline\":\"IC\",\"from\":\"Kolkata\"}]";

			JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false); 
	}

}
