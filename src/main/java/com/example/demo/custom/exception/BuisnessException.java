package com.example.demo.custom.exception;

import org.springframework.stereotype.Component;

@Component
public class BuisnessException extends RuntimeException{
	
	private int errorCode;
	private String errorMessage;
	public BuisnessException(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public BuisnessException() {
		super();
	}
	

}
