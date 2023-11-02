package com.java8;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
	
		ConcurrentMap<String, Integer> cHMap = new ConcurrentHashMap <>();
									   cHMap.put("APPLE_IPhone", 13);
									   cHMap.put("SAMSUNG_Galaxy", 22);
									   cHMap.put("ONEPLUS ", 9);
									   cHMap.put("XIOMI", 11);
									   
System.out.println("Before Calling Compute \t:"+cHMap);	
		
		cHMap.compute("APPLE_IPhone", (Key,Value) -> Value == null ? 1 :Value+1);  //updating atomically using lambda and compute
			
System.out.println("After Calling Compute: \t" +cHMap);

		 ConcurrentMap<String,LongAdder> cHMap2=new ConcurrentHashMap<>();
System.out.println("Before Adding LongAdder : "+cHMap2);
		
		cHMap2.computeIfAbsent("APPLE_IPhone",  value -> new LongAdder()).increment();
		cHMap2.computeIfAbsent("SAMSUNG_Galaxy",value->new LongAdder()).increment();
		cHMap2.computeIfAbsent("SAMSUNG_Galaxy",value->new LongAdder()).increment();
		cHMap2.computeIfAbsent("ONEPLUS", value->new LongAdder()).increment();
		cHMap2.computeIfAbsent("XIOMI", value -> new LongAdder()).increment();
		cHMap2.computeIfAbsent("XIOMI", value -> new LongAdder()).decrement();
		
		
			
System.out.println("After Adding LongAdder :"+cHMap2);



//In the second example, we have an empty ConcurrentHashMap and our job is to add keys and their counts in real-time. This is suited for scenarios like you are doing a sale and you need to keep track of how many copies of a particular book or course are sold.

//Another useful scenario is reading through a text file and printing the count of each word that appears in the file.

//Read more: https://www.java67.com/2017/12/java-8-compute-and-computeifpresent.html#ixzz7udTS4pTf






		
		
		

	}

}
