package com.demo.spring.lombok.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
	BigDecimal dNum;
	String street,area,landmark;
	long pinCode;
	
	
}
