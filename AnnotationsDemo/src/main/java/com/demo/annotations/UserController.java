package com.demo.annotations;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.demo.annotations.model.User;

@Controller
public class UserController {

	@RequestMapping("/home")
	@ResponseBody
	public String home(){
		
	return "Home Page";	
	}
	
	
	@PostMapping("/getusers")
	@ResponseBody
	public String printData (   @RequestBody User user1){                  //RequestBody
		System.out.println("Printing User Data" + user1 );
		return "Success";
		
	}
	
	@GetMapping("/sendusers")											 //RequestBody					
	@ResponseBody
	public User getData() {
		
		User user =new User("sai", "satishp", 14);
		
		
		
		return user;
		
	}

	
	@GetMapping("/users1")													//ResponseEntity 
	public ResponseEntity <List<User>> users(){
		List <User>users =new ArrayList<>();
		users.add(new User("Sai", "SatishPallapolu", 25));
		users.add(new User("Sai", "Pallapolu", 26));
		
				HttpHeaders headers=new HttpHeaders();
				headers.add("Responded", "UserController");
				
		
		return ResponseEntity.accepted().headers(headers).body(users);
		
	}
																			//@PathVariable  name,required,value            
																			//@PathVariable("URI VARIABLE")
		

		@GetMapping("/users/{FName}/{Lname}/{age}")	
		@ResponseBody
	public String PrintUserName( @PathVariable String FName ,@PathVariable(value="Lname") String LName,@PathVariable int age ) {
			return "My Full Name is " + FName+" "+LName+" My age is  "+age;
		
	}	
		
		
																			//RequestParam  name ,DefaultValue,Required=false						
		
		@GetMapping("/userName")
		@ResponseBody
		String getName(@RequestParam(value="uName",required=true) String name){
			return " Mera nam hai "+name;
			
		}
		
	
	@Value("${app.name}")	
	private String appName;
	
	@Value("${app.version}")
	private String appVersion;
	
	@Value("{app.serial:7223023829732}")
	private String serialNum;
	
		
	@GetMapping("/version")
	@ResponseBody
	public String getVersion(){			
		return appName + ":"+appVersion +" :" + serialNum;
		 
	 }
		
		
}
