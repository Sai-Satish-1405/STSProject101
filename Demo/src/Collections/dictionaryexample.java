package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;


public class dictionaryexample {

	public static void main(String[] args) throws IOException {
	//put
		ConcurrentMap<String,String> phonebook =new ConcurrentHashMap<>();
		phonebook.put("India", "+91");
		phonebook.put("US", "+1");
		phonebook.put("UK", "+44");
		phonebook.put("Australia", "+61");
		phonebook.put("China", "+86");
	//show	
		System.out.println("phone book : "+ phonebook);
	//enter country	
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			//		String	country =br.readLine();
		
			
		//System.out.println("Name of country :"+country  +"\n" +"Country Code is :"+phonebook.getOrDefault(country, "Not Found In List") );
		

//------------------------------------------------------------------------------------------------------------------------
	
	 phonebook.entrySet().stream().collect(Collectors.toList()).forEach(System.out::println);
				
		
		

	}

}
