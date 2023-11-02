package com.demo.spring.mockito;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStud implements ToDoService {

	@Override
	public List<String> getToDos(String user) {

 		return Arrays.asList("Java","Azure","Microservices","Spring Mvc","Spring Core" );
	}

	
	
	
	
	
}
