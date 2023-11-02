package com.demo.gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

@SpringBootApplication
@RequestMapping("/gson")
public class AnnotationsGsonApplication {
	
	@GetMapping(value="/getjson")
	 public  String getjson() {
		 
			List<String> skillList= new ArrayList<>();
		    skillList.add("Java");
		    skillList.add("Spring");
		    skillList.add("Boot");
		    skillList.add("Microsrvices");
		    
		   Map<String,String> AddMap= new HashMap<>();
		   AddMap.put("Dno", "1-2");
		   AddMap.put("Street","1stStreet" );
		   AddMap.put("Town","Nellore");
		 
		 Person person = new Person(100,"Sai", skillList, AddMap);
		 
			Gson gson=new GsonBuilder().setPrettyPrinting().create();
		 	String json =gson.toJson(person);
		    System.out.println(json); 
		 	
		 	
		 	Gson gson1 =new Gson();
		     String arrayData=gson1.toJson(skillList);
		    System.out.println(arrayData);
		    
		    
		 
		return json;
	    	
	 }
	

	public static void main(String[] args) {
		SpringApplication.run(AnnotationsGsonApplication.class, args);
		
    System.out.println("....................");
    
    
	}
	

	
}




class Person{
	
	@SerializedName("id")
	private int personId;
	@SerializedName("name")
	private String PersonName;
	@SerializedName("skills")
	private List<String> personSkill;
	@SerializedName("address")
	
	
	private Map<String,String> Address;
	public Person(int personId, String personName, List<String> personSkill, Map<String, String> address) {
		super();
		this.personId = personId;
		PersonName = personName;
		this.personSkill = personSkill;
		Address = address;
	}
	public int getPersonId() {
		return personId;
	}
	public String getPersonName() {
		return PersonName;
	}
	public List<String> getPersonSkill() {
		return personSkill;
	}
	public Map<String, String> getAddress() {
		return Address;
	}
				
}
