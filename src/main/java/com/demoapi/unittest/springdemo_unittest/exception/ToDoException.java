package com.demoapi.unittest.springdemo_unittest.exception;

public class ToDoException extends Exception{
  private String errorMessage;
  
  public ToDoException(String message, String errorMessage) {
	super(message);
	this.errorMessage = errorMessage;
  }
  
  public String getErrorMessage() {
	return errorMessage;
  }
  
  public ToDoException(String toDo_do_not_exist) {
  
  }
}
