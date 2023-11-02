package com.java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8FilterExample 
{
	public static void main(String[] args) 
	{ List<String> versions = new ArrayList<>(); 
	versions.add("Lollipop");
	versions.add("KitKat");
	versions.add("Jelly Bean");
	versions.add("Ice Cream Sandwidth");
	versions.add("Honeycomb");
	versions.add("Gingerbread");
	
	
	
	 versions.stream().filter(x->x.length()>10).forEach(System.out::print);

	String firste =versions.stream().filter(x->x.contains("e")).findFirst().get();
	System.out.println(firste);
	
	List<String> ver5G=versions.stream().filter(x->x.length()>5).filter(x->x.startsWith("G")).collect(Collectors.toList());
	System.out.println(ver5G);
	
	
	
    
	
int[]  instr=IntStream.rangeClosed(-15, 15).filter(x->x%2==0).sorted().distinct().unordered().toArray();
	
	System.out.println(Arrays.toString(instr));
	
	 int intt=IntStream.range(15, 15).max().orElse(-1);	
	   IntSummaryStatistics intt1=IntStream.range(-15, 15).summaryStatistics();
	   
	    List<Integer> in=Stream.of(1,2,3,4,5,6,7).takeWhile(x->x/2!=0).collect(Collectors.toList());
	 
	 
	 System.out.println(intt +" "+intt1 +" "+in);
	}
}

