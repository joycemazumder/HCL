package com.flightService.exception;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
 
 
@ControllerAdvice
@RestController(value = "com.flightService.controller")
public class FlightServiceExceptionHandler extends ResponseEntityExceptionHandler{
	private Logger log=LoggerFactory.getLogger(FlightServiceExceptionHandler.class);
	
	@ExceptionHandler(FlightServiceException.class)
	  public final ResponseEntity<ErrorDetails> handleFlighServiceException(FlightServiceException ex, WebRequest request) {
	    ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
	        request.getDescription(false));
	    System.out.println("@@@@@@");
	    log.error(errorDetails.toString());
	    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	  } 
}
