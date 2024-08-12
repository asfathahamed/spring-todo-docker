package com.asfath.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo_list")
public class Todo {
	
	public enum TodoStatus {active, done, deleted};
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String task;
	private String dueDate;
	private TodoStatus status;
	
	public Todo() {}
	
	public Todo(String task) {
		this.task = task;
		this.status = TodoStatus.active;
	}

	public Long getId() {
		return id;
	}

	public String getTask() {
		return task;
	}

	public String getDueDate() {
		return dueDate;
	}

	public TodoStatus getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", task=" + task + ", dueDate=" + dueDate + ", status=" + status + "]";
	}
	
}
