package com.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class SortingMapByKeys {

	public static void main(String[] args) throws Exception {
	 Map<String, Integer> unsortedBudget = new HashMap<>();
	 unsortedBudget.put("Groceries", 10000);
	 unsortedBudget.put("Rent", 7000);
	 unsortedBudget.put("Travel", 1000);
	 unsortedBudget.put("Fee", 9000);
	 unsortedBudget.put("Clothes",2000);
	 
	System.out.println(unsortedBudget); 
	
	//String  sortedBudget= Stream.of(unsortedBudget).sorted().collect(Collectors.toMap(x->x.ge, null));   
	//System.out.println("");
	
	 
	//unsortedBudget.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(toMap(e->e.getKey(),e ->e.getValue())), (x1x2)->x2, LinkedHashMap::new);	

	

}}
