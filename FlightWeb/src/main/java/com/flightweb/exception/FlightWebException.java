package com.flightweb.exception;

public class FlightWebException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5096899505697003392L;

	public FlightWebException(String message) {
		super("FlightWebException:" + message);

	}

}
