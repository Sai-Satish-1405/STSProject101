package com.demo.spring.mockito;




import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMockitoApplicationTests {

	@Test
	void contextLoads() {	
		
		
	}
	
	
	
@Test	
	public void test() {
		
		ToDoService doServiceStud=new ToDoServiceStud() ;
		ToDoBusiness business=new ToDoBusiness(doServiceStud);
		List<String> retrivedTodo=business.getToDos("Java Dev");
		//System.out.println(retrivedTodo);
		assertEquals(1,retrivedTodo.size());
		System.out.println("Stud working   !!!");
		
	}
		
	
@Test
	public void mockTest() {
	
	ToDoService doService=mock(ToDoService.class);
			List<String> combibeList=Arrays.asList("Java","Java8","SpringBoot","Spring Core");
			when(doService.getToDos("dummy")).thenReturn(combibeList);
	
	ToDoBusiness business=new ToDoBusiness(doService);
	
			List<String> altd=business.getToDos("dummy");
			System.out.println(altd);
	
	assertEquals(2,altd.size());
	
	
	}

	
	
	

	
	
	

}
