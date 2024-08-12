package com.asfath.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todo")
public class TodoController {
	
	@Autowired
	private TodoService service;

	@CrossOrigin(origins = "http://localhost:5173")
	@GetMapping("/list")
	public @ResponseBody List<Todo> getTodoList() {
		return (List<Todo>) service.getAllTodoItems();
	}
}
