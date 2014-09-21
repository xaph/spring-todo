package com.example.todo.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import com.example.todo.models.Todo;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TodoService implements Serializable {

	private static final long serialVersionUID = -1861140564641657941L;

	public TodoService() {
		System.out.println("============= todo service const");
	}

	private List<Todo> todos = new ArrayList<Todo>();

	public void createTodo(Todo todo) {
		todos.add(todo);
	}

	public List<Todo> getAllTodos() {
		return this.todos;
	}
}