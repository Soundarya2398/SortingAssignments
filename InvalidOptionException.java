package com.ty.practicesesion;

public class InvalidOptionException extends RuntimeException {
	
	private String message;
	
	public InvalidOptionException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
		
	}
	
	

}
