package com.passengerService.exception;

public class PassengerServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5096899505697003392L;

	public PassengerServiceException(Exception e) {
		super("PassengerServiceException:" + e.getMessage());

	}

}
