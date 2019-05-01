package com.bridgelabz.oops.common.exception;

public class CustomException extends RuntimeException {

	public CustomException() {
		super("error occured");
	}

	public CustomException(String errorMsg, Throwable error) {
		super(errorMsg, error);
	}

}
