package com.hangw.model;

public class DataNotFoundException extends RuntimeException{
	public DataNotFoundException() {}
	public DataNotFoundException(String message) {
		super(message);
	}
}
