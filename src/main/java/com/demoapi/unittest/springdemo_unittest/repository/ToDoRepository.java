package com.demoapi.unittest.springdemo_unittest.repository;

import com.demoapi.unittest.springdemo_unittest.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
