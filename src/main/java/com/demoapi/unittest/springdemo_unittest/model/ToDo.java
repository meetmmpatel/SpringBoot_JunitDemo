package com.demoapi.unittest.springdemo_unittest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  private String text;
  
  private boolean completed;
  
  public ToDo() {
  }
  
  public ToDo(long id, String text, boolean completed) {
	this.id = id;
	this.text = text;
	this.completed = completed;
  }
  
  public ToDo(String text, boolean completed) {
	this.text = text;
	this.completed = completed;
  }
  
  public long getId() {
	return id;
  }
  
  public void setId(long id) {
	this.id = id;
  }
  
  public String getText() {
	return text;
  }
  
  public void setText(String text) {
	this.text = text;
  }
  
  public boolean isCompleted() {
	return completed;
  }
  
  public void setCompleted(boolean completed) {
	this.completed = completed;
  }
}
