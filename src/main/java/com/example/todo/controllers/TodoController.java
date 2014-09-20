package com.example.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todo.models.Todo;

@Controller
public class TodoController {

	@RequestMapping("/index")
	public String index(@ModelAttribute("todoBean") Todo todo){
		return "showMessage";
	}
}
