package com.demoapi.unittest.springdemo_unittest.service;

import com.demoapi.unittest.springdemo_unittest.model.ToDo;

import java.util.List;
import java.util.Optional;

public interface ToDoService {
  
  public List<ToDo> getAllToDo();
  
  public Optional<ToDo> getToDoById(long id);
  
  public ToDo saveToDo(ToDo toDo);
  
  public void removeToDo(ToDo toDo);
  
  
}
