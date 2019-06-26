package com.demoapi.unittest.springdemo_unittest.controller;

import com.demoapi.unittest.springdemo_unittest.exception.ToDoException;
import com.demoapi.unittest.springdemo_unittest.model.ToDo;
import com.demoapi.unittest.springdemo_unittest.service.ToDoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ToDoController {
  
  
  private static final Logger logger = LoggerFactory.getLogger(ToDoController.class);
  
  @Autowired
  private ToDoService toDoService;
  
  @GetMapping("/todo")
  public ResponseEntity<ToDo> getAllToDo() {
	logger.info("Returning all todo list items");
	return new ResponseEntity<ToDo>((ToDo) toDoService.getAllToDo(), HttpStatus.OK);
  }
  
  @GetMapping("/todo/{id}")
  public Optional<ToDo> getToDoById(@PathVariable("id") long id)throws ToDoException {
    logger.info("ToDo id to return " + id);
    Optional<ToDo> toDo = toDoService.getToDoById(id);
    if(toDo == null ){
    throw new ToDoException("ToDo do not exist");
	}
     return toDo;
  }
  
  
  
  
  
}
