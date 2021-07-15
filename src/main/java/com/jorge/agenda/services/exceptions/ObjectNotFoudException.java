package com.jorge.agenda.services.exceptions;

public class ObjectNotFoudException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoudException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ObjectNotFoudException(String message) {
		super(message);
		
	}
	
	

}
