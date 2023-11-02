package com.java8;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
	public static void main(String[] args) {
	
	 List<Integer>al=Arrays.asList(100,200,300,400,500);
	 	//Total Cost Before Tax											MaptoInt -->sum of stream
	 int totalCost =al.stream().mapToInt(x->x).sum();
	 System.out.println("Total cost before Tax : "+totalCost);
	 
		//after 12 per VAT on cost										map to apply on each 
	 al.stream().map(cost->cost+(0.12*cost)).peek(cost->System.out.print("After 12 % VAT ")).forEach(System.out::println);		
	 	
	 	//Total Bill = Total cost +VAT 12 %                             Reduce:  map to apply on each and aggregate
	 Double bill= al.stream().map(cost->cost+(0.12*cost)).reduce((x,y)->x+y).get();
	 System.out.println("Total cost after 12 % VA Tax : "+bill);
	 
	 
	 
	 
	}

}
