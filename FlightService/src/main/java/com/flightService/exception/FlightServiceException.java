package com.flightService.exception;

public class FlightServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5096899505697003392L;

	public FlightServiceException(Exception e) {
		super("FlightWebException:" + e.getMessage());

	}

}
