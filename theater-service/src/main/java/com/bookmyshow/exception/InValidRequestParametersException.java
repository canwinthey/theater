package com.bookmyshow.exceptions;

public class InValidRequestParametersException extends Exception {

	private static final long serialVersionUID = -248448082635740466L;

	public InValidRequestParametersException() {
		super();
	}

	public InValidRequestParametersException(final String message) {
		super(message);
	}
}
