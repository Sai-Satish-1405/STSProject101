package com.demo.spring.mockito;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ToDoBusiness {
	
	@Autowired
	ToDoService doservice;

	public ToDoBusiness(ToDoService doservice) {
		super();
		this.doservice = doservice;
	}
	
	public List<String> getToDos(String user) {
		
		List<String> retrivedTodo =new ArrayList<>();
		List<String> todos=doservice.getToDos(user);
			for(String todo:todos) {
				if(todo.equals("Spring Core")) {
					System.out.println(todo);
					retrivedTodo.add(todo);
				}
			}
				
		return retrivedTodo;
		
	}
	
	
	
	

}
