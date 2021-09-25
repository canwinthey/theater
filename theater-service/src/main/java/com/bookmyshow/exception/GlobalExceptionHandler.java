package com.bookmyshow.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RecordNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ResponseEntity<String> recordNotFoundException(final RecordNotFoundException exception,
			final HttpServletRequest request) {
		log.debug("GlobalExceptionHandler: RecordNotFoundException...............");
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.EXPECTATION_FAILED);
	}

	@ExceptionHandler(InValidRequestParametersException.class)
	@ResponseStatus(value = HttpStatus.PRECONDITION_REQUIRED)
	public @ResponseBody ResponseEntity<String> inValidRequestParametersException(final InValidRequestParametersException exception,
			final HttpServletRequest request) {
		log.debug("GlobalExceptionHandler: InValidRequestParametersException...............");
		String errorMsg = "Invalid Request Params: " + exception.getMessage();
		return new ResponseEntity<>(errorMsg, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ResponseEntity<String> handleException(final Exception exception,
			final HttpServletRequest request) {
		System.out.println("exception class: " + exception.getClass());
		log.debug("GlobalExceptionHandler: Exception: " + exception.getLocalizedMessage());
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}