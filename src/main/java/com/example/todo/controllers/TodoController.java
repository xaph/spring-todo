package com.example.todo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.todo.models.Todo;
import com.example.todo.service.TodoService;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

	@Autowired
	private TodoService todoService;

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {

		model.addAttribute("todo", new Todo());

		return "showMessage";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String create(Todo todoBean, Model model) {

		todoService.createTodo(todoBean);
		model.addAttribute("message", "Todo created");

		return "showMessage";
	}

	@ModelAttribute("todoBean")
	public Todo createFormBean() {
		return new Todo();
	}

	@ModelAttribute("todos")
	public List<Todo> getTodos() {
		return todoService.getAllTodos();
	}

}
