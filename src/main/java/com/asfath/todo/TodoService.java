package com.asfath.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repository;
	
	public List<Todo> getAllTodoItems() {
		return (List<Todo>) repository.findAll();
	}
}
