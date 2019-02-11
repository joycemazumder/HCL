package com.flightweb.controller;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flightweb.exception.FlightWebException;
import com.json.vo.Flight;

@Controller
public class FlightWebController {

	private static final Logger logger = LoggerFactory.getLogger(FlightWebController.class);

	

	@Value("${ing.url}")
	private String urlString="";
	 
	@RequestMapping(value = "/flightsbyCity", method = RequestMethod.GET)
	public @ResponseBody String getFlightsbyCity(@RequestParam("city") String city) {
		 
		 
		logger.info(city + " in flight......" + urlString+city);
		 
		URL url;
		try {
			url = new URL(urlString+city);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			String inline = "";
			int responsecode = conn.getResponseCode();
			 
			if (responsecode != 200)
				throw new RuntimeException("HttpResponseCode: " + responsecode);
			else {
				Scanner sc = new Scanner(url.openStream());
				inline += sc.nextLine();
 	 
				sc.close();
			}
			 
			ObjectMapper mapper = new ObjectMapper();
			Flight[] obj = mapper.readValue(inline, Flight[].class);

			List<Flight> jsonList = Arrays.asList(obj);
			 
		 
			 
			StringBuilder data = new StringBuilder(" <table><tr><th>flight Id</th><th>Airline</th><th>From</th><th>To</th><th>Date</th></tr>");

			for (Flight jo : jsonList) {
				data.append("<tr><td>");
				data.append(jo.getFlightid());
				data.append("</td>");
				data.append("<td>");
				data.append(jo.getAirline());
				data.append("</td>");
				data.append("<td>");
				data.append(jo.getFrom());
				data.append("</td>");
				data.append("<td>");
				data.append(jo.getTo());
				data.append("</td>");
				data.append("<td>");
				data.append(jo.getDeparture());
				data.append("</td>");
				data.append("</tr>");

			}
			data.append("</table>");
			 
			return data.toString();

		} catch (Exception e) {
			throw new FlightWebException(e.getMessage());
		}

	}

	@ExceptionHandler(FlightWebException.class)
	public @ResponseBody String handleFlightWebException(HttpServletRequest request, Exception ex) {
		logger.error("Requested URL=" + request.getRequestURL());
		logger.error("Exception Raised=" + ex);
		StringBuilder data = new StringBuilder(" <table><tr><th>flight Id</th><th>Airline</th></tr>");

		data.append("<tr><td>");
		data.append("Error in parsing recordset:" + ex.getMessage());
		data.append("</td>");
		data.append("<td>");
		data.append("");
		data.append("</td>");
		data.append("</tr>");

		data.append("</table>");
		 
		return data.toString();

	}
}