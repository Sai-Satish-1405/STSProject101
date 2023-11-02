package com.demo.spring.lombok.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
	
	String fName,lName,fatherName;
	Address address;
	int age;
	Gender gender;
}
