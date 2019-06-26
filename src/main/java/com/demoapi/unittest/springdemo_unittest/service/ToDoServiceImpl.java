package com.demoapi.unittest.springdemo_unittest.service;

import com.demoapi.unittest.springdemo_unittest.model.ToDo;
import com.demoapi.unittest.springdemo_unittest.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService {
  
  @Autowired
  private ToDoRepository toDoRepository;
  
  @Override
  public List<ToDo> getAllToDo() {
	return toDoRepository.findAll();
  }
  
  @Override
  public Optional<ToDo> getToDoById(long id) {
	return toDoRepository.findById(id);
  }
  
  @Override
  public ToDo saveToDo(ToDo toDo) {
	return toDoRepository.save(toDo);
  }
  
  @Override
  public void removeToDo(ToDo toDo) {
	toDoRepository.delete(toDo);
	
  }
}
