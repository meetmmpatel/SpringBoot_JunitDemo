package com.demoapi.unittest.springdemo_unittest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {
  
  @ExceptionHandler(ToDoException.class)
  public ResponseEntity<ErrorMessage> exceptionToDoHandler(Exception ex) {
	
	ErrorMessage error = new ErrorMessage();
	error.setErrorCode(HttpStatus.NOT_FOUND.value());
	error.setMessage(ex.getMessage());
	
	return new ResponseEntity<ErrorMessage>(error, HttpStatus.NOT_FOUND);
  }
  
  @ExceptionHandler(Exception.class)
  public ResponseEntity<ErrorMessage> exceptionHandler(Exception ex) {
	ErrorMessage error = new ErrorMessage();
	error.setErrorCode(HttpStatus.BAD_REQUEST.value());
	error.setMessage("This request can not be processed at time");
	return new ResponseEntity<ErrorMessage>(error, HttpStatus.BAD_REQUEST);
	
	
  }
  
  
}
