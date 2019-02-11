package com.reservationService.exception;

public class ReservationServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5096899505697003392L;

	public ReservationServiceException(Exception e) {
		super("ReservationServiceException:" + e.getMessage());

	}

}
